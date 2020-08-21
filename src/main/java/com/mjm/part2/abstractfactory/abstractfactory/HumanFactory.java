package com.mjm.part2.abstractfactory.abstractfactory;

import com.mjm.part2.abstractfactory.abstractfactory.entity.Human;

/**
 * @author majun
 * @date 2018/10/23 21:00
 *
 * 抽象工厂  将对象的创建氛围多个维度
 */
public interface HumanFactory {
    Human createYelloHuman();
    Human createWhiteHuman();
    Human createBlackHuman();
}
