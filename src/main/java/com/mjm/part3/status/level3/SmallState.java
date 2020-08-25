package com.mjm.part3.status.level3;

import com.mjm.part3.status.level1.State;

/**
 * @author majunmin
 * @description
 * @datetime 2020/8/25 9:57 下午
 * @since
 */
public class SmallState implements IState {

    private StateMachine stateMachine;

    public SmallState(StateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public State state() {
        return State.SMALL;
    }

    @Override
    public void obtainMushRoom() {
        stateMachine.obtainMashRoom();
    }

    @Override
    public void obtainCape() {
        stateMachine.obtainCape();
    }

    @Override
    public void obtainFireFlower() {
        stateMachine.obtainFireFlower();
    }

    @Override
    public void meetMonster() {
        stateMachine.meetMonster();
    }
}
