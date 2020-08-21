package com.mjm.part3.facade.level2;

/**
 * 
 */
public interface ILetterProcess {


    /**
     * @param context
     */
    public void writeContext(String context);

    /**
     * @param address
     */
    public void fillEnveiope(String address);

    /**
     * 
     */
    public void LetterIntoEnvelope();

    /**
     * 
     */
    public void sendLetter();

}