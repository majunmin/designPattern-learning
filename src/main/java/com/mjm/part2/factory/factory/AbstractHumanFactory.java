package com.mjm.part2.factory.factory;

/**
 * @author majun
 * @date 2018/10/23 19:22
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> clazz);
}
