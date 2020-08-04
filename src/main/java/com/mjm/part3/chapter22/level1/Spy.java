package com.mjm.part3.chapter22.level1;

import org.apache.commons.lang3.StringUtils;

/**
 * 
 */
public class Spy extends Thread {

    private HanFeiZi hanFeiZi;

    private LiSi liSi;

    private String type;


    /**
     * Default constructor
     */
    public Spy(HanFeiZi hanFeiZi, LiSi liSi, String type) {
        this.hanFeiZi = hanFeiZi;
        this.liSi = liSi;
        this.type = type;
    }

    @Override
    public void run() {
        while(true){
            if (StringUtils.equals(type, "haveBreakFast")){
                if (this.hanFeiZi.isHaveBreakFast){
                    this.liSi.update("韩非子吃早饭啊。。。");
                    this.hanFeiZi.isHaveBreakFast = Boolean.FALSE;
                }

            }else{
                if (this.hanFeiZi.isHaveFun){
                    this.liSi.update("韩非子在玩耍");
                    this.hanFeiZi.isHaveFun = Boolean.FALSE;
                }
            }
        }
    }
}