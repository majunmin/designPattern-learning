package com.mjm.part3.composite;

import lombok.Getter;

import java.util.List;


public abstract class FileSystemNode {

    @Getter
    protected String path;

    private List<FileSystemNode> subNodes;

    public FileSystemNode(String path) {
        this.path = path;
    }

    protected abstract int countOfFiles();
    protected abstract long sizeOfFiles();
}
