package com.mjm.part3.visitor.level3;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-13 22:21
 * @since
 */
public class WORDFile extends ResourceFile {
    public WORDFile(String filePath) {
        super(filePath);
    }

    @Override
    public String accept(Extractor extractor) {
        return extractor.extract2Txt(this);
    }

    @Override
    public ResourceFile accept(Compressor compressor) {
        return compressor.compress(this);
    }
}
