package com.mjm.part3.facade.level2;

/**
 * 
 */
public class Client {


    public static void main(String[] args) {

        ModenPostOffice modenPostOffice = new ModenPostOffice();
        modenPostOffice.sendLetter("你中奖了500billion", "ah-huihui");
    }
}