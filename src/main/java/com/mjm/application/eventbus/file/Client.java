package com.mjm.application.eventbus.file;

import com.mjm.application.eventbus.Bus;
import com.mjm.application.eventbus.EventBus;

import java.io.IOException;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-07 23:21
 * @since
 */
public class Client {

    public static void main(String[] args) throws IOException {

        Bus bus = new EventBus();
        bus.register(new FileChangeListener());
        DirectoryTargetMonitor monitor = new DirectoryTargetMonitor(bus, "/Users/majunmin/IdeaProjects/designPattern-learning/src/main/java/com/mjm/application", "activeobject");
        monitor.startMonitor();

    }
}
