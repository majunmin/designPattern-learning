package com.mjm.part3.status.level3;

import com.mjm.part3.status.level1.State;

/**
 * 优化后的状态类 接口
 * 默认不支持所有方法, 由子类覆盖(有需要的) -> 使得子类不需要实现不支持的方法
 *
 *
 */
public interface IState2 {

    State state(); //以下是定义的事件

    default void obtainMushRoom(StateMachine stateMachine) {
        throw new RuntimeException();
    }

    default void obtainCape(StateMachine stateMachine) {
        throw new RuntimeException();
    }

    default void obtainFireFlower(StateMachine stateMachine) {
        throw new RuntimeException();
    }

    default void meetMonster(StateMachine stateMachine) {
        throw new RuntimeException();
    }
}
