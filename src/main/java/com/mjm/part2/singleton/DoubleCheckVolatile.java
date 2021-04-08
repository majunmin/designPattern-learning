package com.mjm.part2.singleton;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * @author majun
 * @date 2018/10/22 17:25
 *
 * volatile 禁止指令重排序 (影响性能)
 * 线程安全
 * 效率高
 * 懒加载
 */
public class DoubleCheckVolatile {
    private int i;

    private static volatile DoubleCheckVolatile instance = null;

    private DoubleCheckVolatile() {
        System.out.println("init instance start");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i = 10;
        System.out.println("init instance end");
    }

    public static DoubleCheckVolatile getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckVolatile.class) {
                if (instance == null) {
                    instance = new DoubleCheckVolatile();
                }
            }
        }
        return instance;
    }

    // 使用局部变量的意思是  将原来 两次读主存的操作变为一次, 提高性能
    public static DoubleCheckVolatile getInstance2() {
        DoubleCheckVolatile cv = instance;
        if (cv == null) {
            synchronized (DoubleCheckVolatile.class) {
                cv = instance; // 再一次判断 instance
                if (cv == null) {
                    instance = new DoubleCheckVolatile();
                }
            }
        }
        return instance;
    }
}
