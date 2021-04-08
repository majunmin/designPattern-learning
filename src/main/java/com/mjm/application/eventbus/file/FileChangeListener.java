package com.mjm.application.eventbus.file;

import com.mjm.application.eventbus.Subscribe;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-07 23:20
 * @since
 */
public class FileChangeListener {

    @Subscribe
    public void onChange(FileChangeEvent event) {
        System.out.println(event.getPath() + "-" + event.getKind());
    }
}
