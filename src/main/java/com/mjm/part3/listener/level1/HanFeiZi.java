package com.mjm.part3.listener.level1;

/**
 * 
 */
public class HanFeiZi implements IHanFeiZi {

    private LiSi lisi = new LiSi();

    /**
     * Default constructor
     */
    public HanFeiZi() {
    }

    /**
     * 
     */
    public boolean isHaveFun;

    /**
     * 
     */
    public boolean isHaveBreakFast = Boolean.FALSE;


    /**
     * 
     */
    public void haveBreakfast() {
        System.out.println("韩非子 吃饭了。。。。。。");
        lisi.update("韩非子吃饭呢");
        this.isHaveBreakFast = Boolean.TRUE;
    }

    /**
     * 
     */
    public void haveFun() {
        System.out.println("韩非子 玩耍了。。。。。。");
        lisi.update("韩非子玩呢");
        this.isHaveFun = Boolean.TRUE;
    }

}