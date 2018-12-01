package com.mjm.part3.chapter23.level2;

import java.util.*;

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