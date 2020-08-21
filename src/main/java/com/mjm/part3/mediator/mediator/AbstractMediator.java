package com.mjm.part3.mediator.mediator;


/**
 * @author majun
 * @date 2018/11/19 23:22
 */
public abstract class AbstractMediator {

    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    public AbstractMediator(){
        this.purchase = new Purchase(this);
        this.sale = new Sale(this);
        this.stock = new Stock(this);
    }

    //中介者 最重要的方法 处理多个对象之间的逻辑关系
    public abstract void execcute(String str, Object... objects);
}
