package com.mjm.part3.strategy.geek.define;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 创建策略的工厂 </br>
 * <p>
 * 1. 如果策略类是无状态的, 不包含成员变量,只是纯粹的算法实现,这样的策略对象是可以被共享使用的
 * 2. 如果策略类是有状态的，根据业务场景的需要，我们希望每次从工厂方法中，获得的都是新创建的策略对象，而不是缓存好可共享的策略对象
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-11 13:26
 * @since
 */
public class StrategyFactory {

    private static final Map<String, Strategy> strategies = new HashMap<>();

    static {
        strategies.put("typeA", new ConcreteStrategyA());
        strategies.put("typeB", new ConcreteStrategyB());
    }

    public static Strategy getStrategy(String type) {
        if (StringUtils.isBlank(type)) {
            throw new IllegalArgumentException("typr should not be empty!");
        }
        return strategies.get(type);
    }

    public static Strategy getNewStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        if (type.equals("typeA")) {
            return new ConcreteStrategyA();
        } else if (type.equals("typeB")) {
            return new ConcreteStrategyB();
        }
        return null;
    }
}
