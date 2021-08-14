package com.mjm.logic;

/**
 * 抽象类 </br>
 * <p>
 * 抽象类 一般 用于 解决代码复用问题, 通常应用于 模板模式 (抽象类的实现方式 更加优雅)
 * <p>
 * 1. 抽象类是一种自下而上的设计思路,现有代码重复,然后向上抽一层  抽象父类
 * 2. 接口  是一种自上而下的设计思路, 一般是先考虑定义接口(行为),在编写实现
 *
 * @author majunmin
 * @description
 * @datetime 2021-08-14 10:42
 * @since
 */
public abstract class Logger {

    private String name;
    private boolean enable;
    private Level minPermittedLevel;

    public Logger(String name, boolean enable, Level minPermittedLevel) {
        this.name = name;
        this.enable = enable;
        this.minPermittedLevel = minPermittedLevel;
    }

    public void log(Level level, String message) {
        boolean loggable = enable && (minPermittedLevel.intValue() <= level.intValue());
        if (!loggable) {
            return;
        }
        doLog(level, message);
    }

    protected abstract void doLog(Level level, String message);

}
