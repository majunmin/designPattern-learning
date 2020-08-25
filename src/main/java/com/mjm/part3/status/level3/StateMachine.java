package com.mjm.part3.status.level3;

/**
 * StateMachine 和各个状态类(IState)之间是双向依赖关系。
 *
 * @author majunmin
 * @description
 * @datetime 2020/8/25 9:59 下午
 * @since
 */
public class StateMachine {

    private int score;
    private IState curState;

    public StateMachine() {
        curState = new SmallState(this);
        score = 0;
    }

    public void obtainMashRoom() {
        this.curState.obtainMushRoom();
    }


    public void obtainCape() {
        this.curState.obtainCape();
    }

    public void obtainFireFlower() {
        this.curState.obtainFireFlower();
    }

    public void meetMonster() {
        this.curState.meetMonster();
    }

    public Integer getScore() {
        return score;
    }

    public IState getCurState() {
        return curState;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setCurState(IState curState) {
        this.curState = curState;
    }
}

