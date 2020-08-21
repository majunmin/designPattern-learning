package com.mjm.part3.template.model3extends;

/**
 * Created by majunmin on 2018/11/10.
 *
 * 父类建立框架
 * 子类实现父类部分方法后，在调用从父类继承的方法，从而产生不同的结果
 * 这正是（模板方法模式）
 *
 *
 */
public class Client {

    public static void main(String[] args) {
        Hummer1Model hummer1Model = new Hummer1Model();
        hummer1Model.setAlarmFlag(true);
        hummer1Model.run();

        Hummer2Model hummer2Model = new Hummer2Model();
        hummer2Model.setAlarmFlag(false);
        hummer2Model.run();
    }
}
