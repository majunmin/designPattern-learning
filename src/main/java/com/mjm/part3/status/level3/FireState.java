package com.mjm.part3.status.level3;

import com.mjm.part3.status.level1.State;

/**
 * @author majunmin
 * @description
 * @datetime 2020/8/25 9:58 下午
 * @since
 */
public class FireState implements IState {
    @Override
    public State state() {
        return State.FIRE;
    }

    @Override
    public void obtainMushRoom() {

    }

    @Override
    public void obtainCape() {

    }

    @Override
    public void obtainFireFlower() {

    }

    @Override
    public void meetMonster() {

    }
}
