package com.mjm.part3.status.level3;

import com.mjm.part3.status.level1.State;

/**
 * 优化后的状态类
 * 可以设计为单例
 * 将 状态机类 当做方法参数传入
 *
 * @author majunmin
 * @description
 * @datetime 2020/8/25 9:57 下午
 * @since
 */
public class SmallState2 implements IState2 {

    public SmallState2() {
    }

    @Override
    public State state() {
        return State.SMALL;
    }

    @Override
    public void obtainMushRoom(StateMachine stateMachine) {
        stateMachine.obtainMashRoom();
    }

    @Override
    public void obtainCape(StateMachine stateMachine) {
        stateMachine.obtainCape();
    }

    @Override
    public void obtainFireFlower(StateMachine stateMachine) {
        stateMachine.obtainFireFlower();
    }

    @Override
    public void meetMonster(StateMachine stateMachine) {
        stateMachine.meetMonster();
    }
}