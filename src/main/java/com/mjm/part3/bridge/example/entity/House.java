package com.mjm.part3.bridge.example.entity;

import com.mjm.part3.bridge.example.Product;

/**
 * @author majunmin
 * @description
 * @datetime 2018-12-24 14:39
 */
public class House implements Product {
    @Override
    public void beProducted() {
        System.out.println("build a house!");
    }

    @Override
    public void beSelled() {
        System.out.println("sell a house");
    }
}
