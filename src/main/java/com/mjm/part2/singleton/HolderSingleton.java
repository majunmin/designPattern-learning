package com.mjm.part2.singleton;

/**
 * @author majun
 * @date 2018/10/22 17:32
 *
 * 采用内部类 方式 推荐
 */
public class HolderSingleton {

    private HolderSingleton(){}

    static class SingletonHolder{
        private static final HolderSingleton instance = new HolderSingleton();
    }

    public static HolderSingleton getInstance(){
        return SingletonHolder.instance;
    }
}
