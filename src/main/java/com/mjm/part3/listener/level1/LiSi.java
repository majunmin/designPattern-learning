package com.mjm.part3.listener.level1;

/**
 * 
 */
public class LiSi implements ILiSi {

    /**
     * Default constructor
     */
    public LiSi() {
    }


    /**
     * 
     */
    public void update(String context) {
        System.out.println("李斯观察到 韩非子行动了  报告秦老板！");
        this.reportToQinShiHuang(context);
        System.out.println("---报告完毕---");
    }

    private void reportToQinShiHuang(String context) {
        System.out.println("秦老板， 韩非子活动了 --》 " +  context);
    }

}