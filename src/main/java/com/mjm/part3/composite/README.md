# 组合模式




## 1. 树形结构第一版
```java
package com.mjm.part3.composite;

import com.alibaba.druid.util.StringUtils;
import lombok.Getter;

import java.io.File;
import java.util.List;


public class FileSystemNode {

    private boolean isFile;
    @Getter
    private String path;

    private List<FileSystemNode> subNodes;

    public FileSystemNode(boolean isFile, String path) {
        this.isFile = isFile;
        this.path = path;
    }

    public int countOfFiles() {
        if (isFile) {
            return 1;
        }
        int count = 0;
        for (int i = 0; i < subNodes.size(); i++) {
            count += subNodes.get(i).countOfFiles();
        }
        return count;
    }

    private long sizeOfFiles() {
        if (isFile) {
            File file = new File(path);
            if (!file.exists()) {
                return 0L;
            }
            return file.length();
        }
        int size = 0;
        for (int i = 0; i < subNodes.size(); i++) {
            size += subNodes.get(i).sizeOfFiles();
        }
        return size;
    }


    private void addSubNodes(FileSystemNode node) {
        subNodes.add(node);
    }

    public void removeSunNodes(FileSystemNode node) {
        subNodes.removeIf(subNode -> StringUtils.equals(subNode.getPath(), node.getPath()));
    }
}

```