package com.mjm.part3.chapter29.example;

/**
 * @author majunmin
 * @description
 * @datetime 2018-12-24 14:59
 */
public class ShanZhaiCorp extends Corp {

    /**
     * 调用时 才知道 要生产什么 产品
     * @param product
     */
    public ShanZhaiCorp(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("赚钱就好呀...");
    }
}
