package com.mjm.part3.chapter29.example.entity;

import com.mjm.part3.chapter29.example.Product;

/**
 * @author majunmin
 * @description
 * @datetime 2018-12-24 16:00
 */
public class IPod implements Product {
    @Override
    public void beProducted() {
        System.out.println("produce a ipod...");
    }

    @Override
    public void beSelled() {
        System.out.println("sell a ipod...");
    }
}
