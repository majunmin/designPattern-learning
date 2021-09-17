package com.mjm.part3.visitor.level4;

public interface Visitor {
    void visit(PDFFile pdfFile);

    void visit(WORDFile wordFile);

    void visit(PPTFile pptFile);
}
