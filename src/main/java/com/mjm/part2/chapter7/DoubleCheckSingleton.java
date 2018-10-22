package com.mjm.part2.chapter7;

import java.net.Socket;
import java.sql.Connection;

/**
 * 保障了 懒加载 单例  高效性
 * 多线程条件下可能会引起 NullPointException
 * 若在Singleton构造函数中 分别需要实例化两个s实例变量conn socket，还有Singleton自身
 * 由于指令重排序，这三个实例的初始化顺序并没有保证，可能singleton先完成了初始化，而conn socket还未初始化，调用未初始化的实例方法的方法将会抛出异常
 */
public final class DoubleCheckSingleton {
    private Connection conn;
    private Socket socket;
    private DoubleCheckSingleton(){
//        conn = new Connection();
//        socket = new Socket();
    }

    private byte[] data = new byte[1024];

    public static DoubleCheckSingleton instance = null;

    public static DoubleCheckSingleton getInstance(){
        if (instance == null){
            synchronized(DoubleCheckSingleton.class){
                if (instance == null){
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
