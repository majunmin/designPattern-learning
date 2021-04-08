package com.mjm.application.eventbus.file;

import lombok.Getter;

import java.nio.file.Path;
import java.nio.file.WatchEvent;

/**
 * 封装  Path 和 WatchEvent.Kind </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-07 23:10
 * @since
 */
@Getter
public class FileChangeEvent {

    private Path path;
    private WatchEvent.Kind<?> kind;

    public FileChangeEvent(Path path, WatchEvent.Kind<?> kind) {
        this.path = path;
        this.kind = kind;
    }
}
