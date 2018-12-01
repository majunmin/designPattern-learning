package com.mjm.part3.chapter23.level2;

import com.mjm.part3.chapter23.level2pa.LetterProcessImpl;

/**
 * 
 */
public class Client {


    public static void main(String[] args) {

        ModenPostOffice modenPostOffice = new ModenPostOffice();
        modenPostOffice.sendLetter("你中奖了500billion", "ah-huihui");
    }
}