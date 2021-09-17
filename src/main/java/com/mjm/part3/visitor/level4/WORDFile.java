package com.mjm.part3.visitor.level4;

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
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
