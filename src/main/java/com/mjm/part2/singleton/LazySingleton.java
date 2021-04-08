package com.mjm.part2.singleton;

/**
 * @author majun
 * @date 2018/10/22 10:22
 *
 *
 * 非线程安全
 * 懒加载
 *
 */
public class LazySingleton {
    public static LazySingleton instance = null;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if (instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
