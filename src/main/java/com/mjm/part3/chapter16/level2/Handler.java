package com.mjm.part3.chapter16.level2;

import com.mjm.part3.chapter16.level2.IWomen;

import java.util.Objects;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2019-05-13 21:27
 * @since
 */
public abstract class Handler {

    int FATHER_LEVEL_REQUEST = 1;
    int HUSBAND_LEVEL_REQUEST = 2;
    int SON_LEVEL_REQUEST = 3;

    //能处理的级别
    private int level =0;

    //责任传递，下一个人责任人是谁
    private Handler nextHandler;

    //每个类都要说明一下自己能处理哪些请求
    public Handler(int level){
        this.level = level;
    }

    /**
     * 这里 类似 模板方法
     * @param women
     */
    public void handleMessage(IWomen women){

        if (women.getType() == level){
            // 处理请求
            this.response(women);
        } else {
            if (Objects.nonNull(nextHandler)) {
                nextHandler.handleMessage(women);
            } else {
                System.out.println("---没地方请示了，按不同意处理---\n");
            }
        }

    }

    /**
     * 响应
     * @param women
     */
    protected abstract void response(IWomen women);


    /**
     * 入股自身不能处理， 交给下一个 handler 处理
     * @param nextHandler
     */
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }


}
