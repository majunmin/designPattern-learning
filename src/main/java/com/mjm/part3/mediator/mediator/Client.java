package com.mjm.part3.mediator.mediator;

/**
 * @author majun
 * @date 2018/11/19 23:44
 */
public class Client {

    public static void main(String[] args) {
        AbstractMediator mediator = new ConcretMediator();

        System.out.println("==================采购电脑100台");
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMComputer(100);

        System.out.println("================销售人员销售电脑");
        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(46);
        System.out.println("================库存人员清库存");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }

}
