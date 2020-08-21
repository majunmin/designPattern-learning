package com.mjm.part3.facade.level1;

/**
 * 
 */
public interface ILetterProcess {

    /**
     * 
     */
    void writeContext(String context);

    /**
     * 
     */
    void fillEnveiope(String address);

    /**
     * 
     */
    void LetterIntoEnvelope();

    /**
     * 
     */
    void sendLetter();

}