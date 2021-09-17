package com.mjm.part3.visitor.level4;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-13 22:40
 * @since
 */
public class CompressorVisitor implements Visitor {

    @Override
    public void visit(PDFFile pdfFile) {
        System.out.println("compress pdfFile...");
    }

    @Override
    public void visit(WORDFile wordFile) {
        System.out.println("compress wordFile...");
    }

    @Override
    public void visit(PPTFile pptFile) {
        System.out.println("compress pptFile...");
    }
}
