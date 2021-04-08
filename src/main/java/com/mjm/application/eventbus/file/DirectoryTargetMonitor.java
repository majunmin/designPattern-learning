package com.mjm.application.eventbus.file;

import com.mjm.application.eventbus.Bus;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.Objects;

/**
 * 文件目录监控 </br>
 * 当指定目录发生 StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_DELETE 事件,
 * 便会收到通知,并封装成 FileChangeEvent 提交给  EventBus
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-07 23:00
 * @since
 */
public class DirectoryTargetMonitor {

    private WatchService watchService;

    private final Bus bus;
    private final Path path;

    private volatile boolean start = false;

    public DirectoryTargetMonitor(final Bus bus, final String targetPath) {
        this(bus, targetPath, "");
    }

    // 构造 Monitor的时候需要传入 EventBus 和 需要监控的目录
    public DirectoryTargetMonitor(Bus bus, String targetPath, String... morePaths) {
        this.bus = bus;
        this.path = Paths.get(targetPath, morePaths);
    }

    public void startMonitor() throws IOException {
        this.watchService = FileSystems.getDefault().newWatchService();
        // 注册感兴趣的事件
        this.path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE,
                StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_DELETE);

        System.out.println("the directory " + path + " is monitoring...");

        this.start = true;

        while (start) {
            WatchKey watchKey = null;
            try {
                // 当有事件发生时 会返回对应的  watchKey
                // 可以被中断退出
                watchKey = watchService.take();
                watchKey.pollEvents().forEach(event -> {
                    WatchEvent.Kind<?> kind = event.kind();
                    Path path = (Path) event.context();
                    Path child = DirectoryTargetMonitor.this.path.resolve(path);

                    // 提交 FileChannelEvent 到 Bus - 使用默认Topic
                    bus.post(new FileChangeEvent(child, kind));
                });
            } catch (Exception e) {
                e.printStackTrace();
                // 退出循环
                this.start = false;
            } finally {
                if (Objects.nonNull(watchKey)) {
                    watchKey.reset();
                }
            }
        }
    }

    public void stopMonitor() throws IOException {
        System.out.println("the directory " + path + " monitor will be stop...");

        Thread.currentThread().interrupt();
        this.start = false;
        this.watchService.close();

        System.out.println("the directory " + path + " monitor stop done.");
    }


}
