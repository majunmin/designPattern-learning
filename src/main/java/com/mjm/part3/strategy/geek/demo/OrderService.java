package com.mjm.part3.strategy.geek.demo;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-11 13:39
 * @since
 */
public class OrderService {

    public double discount(Order order) {
        OrderType type = order.getType();
        DiscountStrategy discountStrategy = DiscountStrategyFactory.getStrategy(type);
        return discountStrategy.calDiscount(order);
    }


    /**
     * 策略模式的使用  屏蔽了   if else 大量繁杂代码
     *
     * @param args
     */
    public static void main(String[] args) {
        double discount = new OrderService().discount(new Order());
    }
}
