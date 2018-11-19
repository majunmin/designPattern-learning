package com.mjm.part3.chapter14.couping;

/**
 * Created by majunmin on 2018/11/18.
 */
public class Stock {
    public static int COMPUTER_NUM = 0;

    public void increase(int number) {
        COMPUTER_NUM = COMPUTER_NUM +number;
        System.out.println("库存数量为：" + COMPUTER_NUM);
    }

    public void decrese(int number) {
        COMPUTER_NUM = COMPUTER_NUM - number;
        System.out.println("库存数量为：" + COMPUTER_NUM);
    }

    /**
     *
      * @return 库存数量
     */
    public int getStockNumber(){
        return COMPUTER_NUM;
    }

    public void clearStock(){
        Purchase purchase = new Purchase();
        Sale sale = new Sale();

        System.out.println("清理存货数量为：" + COMPUTER_NUM);
        //半价销售
        sale.offSale();
        purchase.refuseBuyIBMComputer();
    }


}
