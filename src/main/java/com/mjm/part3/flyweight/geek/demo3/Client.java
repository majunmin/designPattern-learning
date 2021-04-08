package com.mjm.part3.flyweight.geek.demo3;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-03-26 19:32
 * @since
 */
public class Client {

    public static void main(String[] args) {

        System.out.println(IntegerCache.valueOf(1));
        System.out.println(IntegerCache.valueOf(2));
        System.out.println(IntegerCache.valueOf(3));
        System.out.println(IntegerCache.valueOf(4));
        System.out.println(IntegerCache.valueOf(5));
    }
}
