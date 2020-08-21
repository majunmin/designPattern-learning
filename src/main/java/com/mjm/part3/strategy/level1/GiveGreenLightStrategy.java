package com.mjm.part3.strategy.level1;

/**
 * 找吴国太哭诉，企图给自己开绿灯 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2019-05-14 18:12
 * @since
 */
public class GiveGreenLightStrategy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开绿灯,放行！");
    }
}
