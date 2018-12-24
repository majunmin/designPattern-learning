package com.mjm.part3.chapter29.example;

/**
 * @author majunmin
 * @description
 * @datetime 2018-12-24 14:32
 */
public abstract class Corp {

    private Product product;

    public Corp(Product product){
       this.product = product;
    }

    public void makeMoney(){
        this.product.beProducted();
        this.product.beSelled();
    }

    public Product getProduct() {
        return product;
    }
}
