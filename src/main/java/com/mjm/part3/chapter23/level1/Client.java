package com.mjm.part3.chapter23.level1;

/**
 * 
 */
public class Client {

    public static void main(String[] args) {
        ILetterProcess letterProcess = new LetterProcessImpl();
        letterProcess.writeContext("你中奖了");
        letterProcess.fillEnveiope("ah-jxm");
        letterProcess.LetterIntoEnvelope();
        letterProcess.sendLetter();
    }

}