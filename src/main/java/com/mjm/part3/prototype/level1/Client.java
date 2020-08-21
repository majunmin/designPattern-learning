package com.mjm.part3.prototype.level1;

import java.util.Random;

/**
 * Created by majunmin on 2018/11/12.
 */
public class Client {

    //发送账单的数量
    public static final int MAX_COUNT = 6;

    public static void main(String[] args) {

        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX银行版权所有");
        for (int i = 0; i < MAX_COUNT; i++) {
            mail.setAppellation(getRandomString(5) + "先生/女士");
            mail.setReceiver(getRandomString(5) + "@" + getRandomString(8));
            sendMail(mail);
        }
    }

    private static void sendMail(Mail mail) {
        System.out.println("标题： "+ mail.getSubject());
        System.out.println("收件人： "+ mail.getReceiver());
        System.out.println("内容： "+ mail.getContext());
        System.out.println("落款： "+ mail.getTail());
    }

    private static String getRandomString(int len) {
        String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRETUVWXYZ";
        StringBuffer stringBuffer = new StringBuffer();
        Random random = new Random();
        int index = 0;
        for (int i = 0; i < len; i++) {
            index = random.nextInt(source.length());
            stringBuffer.append(source.charAt(index));
        }
        return stringBuffer.toString();
    }
}
