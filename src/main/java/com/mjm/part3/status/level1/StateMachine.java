package com.mjm.part3.status.level1;

/**
 * 分支 逻辑的实现方式
 *   简单的状态转换可以接受
 *   复杂的状态转换的话, 代码中充斥着大量的 if-else 或者 switch-case 分支判断逻辑，可读性和可维护性都很差
 *
 * @author majunmin
 * @description
 * @datetime 2020/8/25 7:26 下午
 * @since
 */
public class StateMachine {

    private State curState;
    private Integer score;

    public StateMachine() {
        curState = State.SMALL;
        score = 0;
    }

    public void obtainMashRoom() {
        if (curState == State.SMALL) {
            this.score += 100;
            this.curState = State.SUPER;
        }

    }

    public void obtainCape() {
        if (curState == State.SMALL || curState == State.SUPER) {
            this.score += 200;
            this.curState = State.FIRE;
        }
    }

    public void obtainFireFlower() {
        if (curState == State.SMALL || curState == State.SUPER) {
            this.score += 300;
            this.curState = State.FIRE;
        }
    }

    public void meetMonster() {
        if (curState.equals(State.SUPER)) {
            this.curState = State.SMALL;
            this.score -= 100;
            return;
        }

        if (curState.equals(State.CAPE)) {
            this.curState = State.SMALL;
            this.score -= 200;
            return;
        }

        if (curState.equals(State.FIRE)) {
            this.curState = State.SMALL;
            this.score -= 300;
            return;
        }
    }

    public Integer getScore() {
        return score;
    }

    public State getCurState() {
        return curState;
    }
}


