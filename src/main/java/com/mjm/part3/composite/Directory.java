package com.mjm.part3.composite;

import com.alibaba.druid.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemNode {

    private final List<FileSystemNode> subNodes;

    public Directory(String path) {
        super(path);
        subNodes = new ArrayList<>();
    }

    public int countOfFiles() {
        int count = 0;
        for (int i = 0; i < subNodes.size(); i++) {
            count += subNodes.get(i).countOfFiles();
        }
        return count;
    }

    public long sizeOfFiles() {
        int size = 0;
        for (int i = 0; i < subNodes.size(); i++) {
            size += subNodes.get(i).sizeOfFiles();
        }
        return size;
    }


    public void addSubNode(FileSystemNode node) {
        subNodes.add(node);
    }

    public void removeSunNode(FileSystemNode node) {
        subNodes.removeIf(subNode -> StringUtils.equals(subNode.getPath(), node.getPath()));
    }
}
