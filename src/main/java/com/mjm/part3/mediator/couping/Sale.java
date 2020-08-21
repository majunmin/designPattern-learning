package com.mjm.part3.mediator.couping;

import java.util.Random;

/**
 * Created by majunmin on 2018/11/18.
 */
public class Sale {

    public void sellIBMComputer(int number){
        Stock stock = new Stock();
        Purchase purchase = new Purchase();

        if (stock.getStockNumber() < number){
            purchase.buyIBMComputer(number);
        }
        System.out.println("销售IBM电脑"+ number + "台");
        stock.decrese(number);

    }

    public int getSaleStatus() {
        Random random = new Random(47);
        int saleStatus = random.nextInt(100);
        System.out.println("IBM电脑销售情况为： " + saleStatus);
        return saleStatus;
    }

    public void offSale() {
        //库房有多少卖多少
        Stock stock = new Stock();
        System.out.println("折价销售IBM电脑");
    }
}
