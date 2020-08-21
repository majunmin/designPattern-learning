package com.mjm.part3.facade.level2pa;

import com.mjm.part3.facade.level2.ILetterProcess;

/**
 *
 */
public class LetterProcessImpl implements ILetterProcess {

    /**
     * Default constructor
     */
    public LetterProcessImpl() {
    }

    /**
     *
     */
    @Override
    public void writeContext(String context) {
        System.out.println("-----填写信得内容----" + context);
    }

    /**
     *
     */
    @Override
    public void fillEnveiope(String address) {
        System.out.println("填写收件人地址以及姓名" + address);
    }

    /**
     * 把新放到信封中， 并封好
     */
    @Override
    public void LetterIntoEnvelope() {
        System.out.println("---将信放到信封中---");
    }

    /**
     * 塞到信箱中 邮递
     */
    @Override
    public void sendLetter() {
        System.out.println("---投递邮件---");
    }

}