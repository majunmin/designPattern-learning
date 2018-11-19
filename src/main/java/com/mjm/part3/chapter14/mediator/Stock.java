package com.mjm.part3.chapter14.mediator;

import com.mjm.part3.chapter14.couping.Purchase;
import com.mjm.part3.chapter14.couping.Sale;

/**
 * @author majun
 * @date 2018/11/19 23:40
 */
public class Stock extends AbstractColleague {
    public Stock(AbstractMediator mediator) {
        super(mediator);
    }

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
        System.out.println("清理存货数量为：" + COMPUTER_NUM);
        //半价销售
       super.mediator.execcute("stock.clear");
    }
}
