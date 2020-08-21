package com.mjm.part3.strategy.level1;

/**
 * 承载策略的 锦囊 </br>
 *
 * 通过构造函数把策略传递进来，然后用operate()方法来执行相关的策略方法。
 *
 * @author majunmin
 * @description
 * @datetime 2019-05-14 18:14
 * @since
 */
public class Context {

    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    //使用计谋了，看我出招了
    void operate(){
        strategy.operate();
    }
}
