package com.mjm.part3.visitor.level3;

import java.util.ArrayList;
import java.util.List;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-13 22:23
 * @since
 */
public class Client {

    public static void main(String[] args) {

        Extractor extractor = new Extractor();
        List<ResourceFile> resourceFileList = listAllResourceFile();
        for (ResourceFile resourceFile : resourceFileList) {
            System.out.println(resourceFile.accept(extractor));
        }
    }


    private static List<ResourceFile> listAllResourceFile() {
        List<ResourceFile> resourceFiles = new ArrayList<>();
        resourceFiles.add(new PDFFile(""));
        resourceFiles.add(new WORDFile(""));
        resourceFiles.add(new PPTFile(""));
        return resourceFiles;
    }
}
