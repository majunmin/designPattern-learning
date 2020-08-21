package com.mjm.part3.mediator.couping;

/**
 * Created by majunmin on 2018/11/18.
 *
 * 定义了采购电脑的标准 根据销售情况
 */
public class Purchase {

    public void buyIBMComputer(int number){
        //访问库存情况
        Stock stock = new Stock();
        //访问销售情况
        Sale sale = new Sale();

        //如果销售情况良好 采购电脑 nunber  不好 折半采购
        int saleStatus = sale.getSaleStatus();
        if (saleStatus > 80){
            stock.increase(number);
            System.out.println("采购电脑" + number + "台");
        }else {
            stock.increase(number / 2);
            System.out.println("采购电脑" + number + "台");
        }
    }

    public void refuseBuyIBMComputer(){
        System.out.println("不在采购IBM电脑");
    }
}
