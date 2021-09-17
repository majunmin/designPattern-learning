package com.mjm.part3.strategy.geek.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-11 13:36
 * @since
 */
public class DiscountStrategyFactory {

    private static final Map<OrderType, DiscountStrategy> strategies = new HashMap<>();

    /**
     * 铜鼓查表法代替  if-else
     */
    static {
        strategies.put(OrderType.NORMAL, new NormalDiscountStrategy());
        strategies.put(OrderType.GROUPON, new GrouponDiscountStrategy());
        strategies.put(OrderType.PROMOTION, new PromotionDiscountStrategy());
    }

    public static DiscountStrategy getStrategy(OrderType orderType) {
        return strategies.get(orderType);
    }
}
