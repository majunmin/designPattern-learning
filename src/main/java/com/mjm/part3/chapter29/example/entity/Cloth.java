package com.mjm.part3.chapter29.example.entity;

import com.mjm.part3.chapter29.example.Product;

/**
 * @author majunmin
 * @description
 * @datetime 2018-12-24 14:49
 */
public class Cloth implements Product {
    @Override
    public void beProducted() {
        System.out.println("produce a cloth");
    }

    @Override
    public void beSelled() {
        System.out.println("sell a cloth");
    }
}
