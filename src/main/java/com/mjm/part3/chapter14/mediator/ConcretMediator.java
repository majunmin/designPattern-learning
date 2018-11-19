package com.mjm.part3.chapter14.mediator;

/**
 * @author majun
 * @date 2018/11/19 23:25
 */
public class ConcretMediator extends AbstractMediator {
    @Override
    public void execcute(String str, Object... objects) {
        if (str.equals("purchase.buy")){
            this.buyComputer((Integer)objects[0]);
        }else if(str.equals("sale.sell")){
            this.saleComputer((Integer)objects[0]);
        }else if(str.equals("sale.offSell")){
            this.offSell();
        }else if(str.equals("sale.clear")){
            this.clearStock();
        }
    }

    public void buyComputer(Integer number){
        int saleStatus = sale.getSaleStatus();
        if (saleStatus > 80){
            stock.increase(number);
            System.out.println("采购电脑" + number + "台");
        }else {
            stock.increase(number / 2);
            System.out.println("采购电脑" + number + "台");
        }
    }

    public void saleComputer(Integer number){
        if (stock.getStockNumber() < number){
            purchase.buyIBMComputer(number);
        }
        stock.decrese(number);

    }

    public void offSell(){
        System.out.println("折价销售IBM电脑");
    }

    public void clearStock(){
        //半价销售
        super.sale.offSell();
        super.purchase.refuseBuyIBMComputer();
    }
}
