package com.mjm.part3.chapter29.example;

/**
 * @author majunmin
 * @description
 * @datetime 2018-12-24 14:54
 */
public class ClothCorp extends Corp {
    public ClothCorp(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("cloth making money ...");
    }
}
