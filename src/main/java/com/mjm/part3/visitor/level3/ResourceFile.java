package com.mjm.part3.visitor.level3;


/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-13 22:19
 * @since
 */
public abstract class ResourceFile {

    protected String filePath;

    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }

    public abstract String accept(Extractor extractor);

    public abstract ResourceFile accept(Compressor compressor);
}
