package com.mjm.part3.chapter15.level2;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2019-05-13 17:28
 * @since
 */
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker(new AddRequirementCommand());
        invoker.action();
    }
}
