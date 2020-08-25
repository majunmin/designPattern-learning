package com.mjm.part3.status.level3;

import com.mjm.part3.status.level1.State;

/**
 * 状态类持有状态机的引用
 *
 * 因为状态类 无状态(没有属性， 可以设计为单例模式  此时可以将  状态机类 当做方法参数传入)
 */
public interface IState {

    State state(); //以下是定义的事件

    void obtainMushRoom();

    void obtainCape();

    void obtainFireFlower();

    void meetMonster();
}
