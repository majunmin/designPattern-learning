package com.mjm.part2.chapter7;

/**
 * @author majun
 * @date 2018/10/22 10:19
 *
 * 确保
 * 只有一个实例
 * 线程安全
 * 非懒加载
 */
public class HungrySingleton {

    public static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return instance;
    }
}
