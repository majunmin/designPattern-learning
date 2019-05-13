package com.mjm.part3.chapter16.level2;

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

        this.type = type;
        //为了便于显示，在这里做了点处理
        switch(this.type){
            case 1:
                this.request = "女儿的请求是：" + request;
                break;
            case 2:
                this.request = "妻子的请求是：" + request;
                break;
            case 3:
                this.request = "母亲的请求是：" + request;
        }
    }

    @Override
    public int getType() {
        return type;
    }

    @Override
    public String getRequest() {
        return request;
    }
}
