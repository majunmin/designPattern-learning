package com.mjm.part2.singleton;

/**
 * @author majun
 * @date 2018/10/22 17:32
 *
 * 采用静态内部类 方式 推荐
 */
public class HolderSingleton {

    private HolderSingleton(){}

    // 静态内部类的方式  利用 jvm 的特性 保证 实例的唯一性和线程安全性
    static class SingletonHolder{
        private static final HolderSingleton instance = new HolderSingleton();
    }

    public static HolderSingleton getInstance(){
        return SingletonHolder.instance;
    }
}
