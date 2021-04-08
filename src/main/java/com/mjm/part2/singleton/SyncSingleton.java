package com.mjm.part2.singleton;

/**
 * @author majun
 * @date 2018/10/22 17:16
 *
 * 线程安全w
 * 懒加载
 * 多线程情况下 效率低（串行化）
 */
public class SyncSingleton {

    private static final SyncSingleton instance = null;

    private SyncSingleton(){}

    public static synchronized SyncSingleton getInstance(){
        if (instance == null){
            return new SyncSingleton();
        }
        return instance;
    }
}
