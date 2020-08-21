package com.mjm.part3.strategy.level1;

/**
 * 找乔国老开后门 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2019-05-14 18:11
 * @since
 */
public class BackDoorStrategy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
    }
}
