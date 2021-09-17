package com.mjm.part3.visitor.level4;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-13 22:44
 * @since
 */
public class ExtractVisitor implements Visitor {
    @Override
    public void visit(PDFFile pdfFile) {
        System.out.println("extract pdffile...");
    }

    @Override
    public void visit(WORDFile wordFile) {
        System.out.println("extract wordFile...");
    }

    @Override
    public void visit(PPTFile pptFile) {
        System.out.println("extract pptFile...");
    }
}
