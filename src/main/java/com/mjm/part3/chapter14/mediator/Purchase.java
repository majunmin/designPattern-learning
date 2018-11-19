package com.mjm.part3.chapter14.mediator;

/**
 * @author majun
 * @date 2018/11/19 23:35
 */
public class Purchase extends AbstractColleague {
    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    public void buyIBMComputer(int number){
       super.mediator.execcute("purchase.buy", 100);
    }

    public void refuseBuyIBMComputer(){
        System.out.println("不在采购IBM电脑");
    }
}
