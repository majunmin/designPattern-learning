package com.mjm.part3.strategy.level1;

/**
 * 在逃跑的时候，让新娘子孙夫人断后 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2019-05-14 18:13
 * @since
 */
public class BlockEnemyStrategy implements IStrategy {

    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
