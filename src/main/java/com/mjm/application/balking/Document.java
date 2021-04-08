package com.mjm.application.balking;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 文档 和 对文档的操作 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-06 08:49
 * @since
 */
public class Document {

    // 文档修改,changed会被设置为 true
    private boolean changed;

    // 文档的内容， 可以理解为 内容缓存(编辑线程和 保存线程共享)
    private List<String> content = new ArrayList<>();

    private final FileWriter writer;

    private static AutoSavedThread autoSavedThread;

    public Document(String documentPath, String documentName) throws IOException {
        this.writer = new FileWriter(new File(documentPath, documentName));
    }

    public static Document createDocument(String documentPath, String documentName) throws IOException {
        Document document = new Document(documentPath, documentName);
        autoSavedThread = new AutoSavedThread(document);
        autoSavedThread.start();
        return document;
    }

    // 文档的编辑  实际上就是往  content里面添加内容
    public void edit(String content) {
        synchronized (this) {
            this.content.add(content);
            this.changed = true;
        }
    }

    public void close() throws IOException {
        writer.close();
        autoSavedThread.interrupt();
    }

    public void save() throws IOException {
        synchronized (this) {
            // balking, 如果文档已经被保存了,就直接返回
            if (!changed) {
                return;
            }
            System.out.println(Thread.currentThread() + " execute save action!");
            for (String line : content) {
                writer.write(line);
                writer.write("\r\n");
            }
            this.writer.flush();
            // 修改 changed 状态, 表明 此刻没有新内容编辑
            this.changed = false;
            this.content.clear();
        }
    }
}
