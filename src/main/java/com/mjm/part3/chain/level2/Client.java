package com.mjm.part3.chain.level2;

import java.util.ArrayList;
import java.util.Random;

/**
 * 调用类 不需要知道 哪个处理者处理请求， 只需要构建调用链
 * 而是由处理者 进行判断 是否处理该请求
 */
public class Client {
    public static void main(String[] args) {
        // 随机挑选几个女性
        Random rand = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(1, "我要出去逛街"));
        }
        // 定义三个请示对象
        Handler father = new Father(1);
        Handler husband = new Husband(2);
        Handler son = new Son(3);
        // 设置请示顺序
        father.setNextHandler(husband);
        husband.setNextHandler(son);
        for (IWomen women : arrayList) {
            father.handleMessage(women);
        }
    }
}