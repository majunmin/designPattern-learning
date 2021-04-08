package com.mjm.part3.composite;


public class File extends FileSystemNode {
    public File(String path) {
        super(path);
    }

    public int countOfFiles() {
        return 1;
    }

    public long sizeOfFiles() {
        java.io.File file = new java.io.File(this.getPath());
        if (!file.exists()) {
            return 0L;
        }
        return file.length();
    }
}
