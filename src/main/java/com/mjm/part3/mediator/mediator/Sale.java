package com.mjm.part3.mediator.mediator;

import java.util.Random;

/**
 * @author majun
 * @date 2018/11/19 23:37
 */
public class Sale extends AbstractColleague {
    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    public void sellIBMComputer(int number){
        super.mediator.execcute("sale.sell", number);
        System.out.println("销售IBM电脑"+ number + "台");

    }

    public int getSaleStatus() {
        Random random = new Random(47);
        int saleStatus = random.nextInt(100);
        System.out.println("IBM电脑销售情况为： " + saleStatus);
        return saleStatus;
    }

    public void offSell() {
        //库房有多少卖多少
        super.mediator.execcute("sale.offSell");
    }
}
