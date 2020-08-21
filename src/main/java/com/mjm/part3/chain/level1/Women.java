package com.mjm.part3.chain.level1;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2019-05-13 20:55
 * @since
 */
public class Women implements IWomen {

    /**
     * 通过 返回的 int值  获得女性的个人状况
     * 1 未出嫁
     * 2 出嫁
     * 3 夫死
     * @return
     */
    private int type = 0;

    /**
     * 妇女的请示
     */
    private String request;

    public Women(int type, String request){
        this.type = type;
        this.request = request;
    }

    @Override
    public int getType() {
        return 0;
    }

    @Override
    public String getRequest() {
        return null;
    }
}
