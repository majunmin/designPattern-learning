package com.mjm.part2.chapter7;

/**
 * @author majun
 * @date 2018/10/22 17:25
 *
 * volatile 禁止指令重排序
 * 线程安全
 * 效率高
 * 懒加载
 */
public class DoubleCheckVolatile {

    private static volatile DoubleCheckVolatile instance = null;

    private DoubleCheckVolatile() {
    }

    public static DoubleCheckVolatile getInstance() {
        if (instance == null) {
            if (instance == null) {
                instance = new DoubleCheckVolatile();
            }
        }
        return instance;
    }
}
