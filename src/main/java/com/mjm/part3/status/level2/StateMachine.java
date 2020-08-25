package com.mjm.part3.status.level2;

import com.mjm.part3.status.level1.State;

import static com.mjm.part3.status.level1.State.CAPE;
import static com.mjm.part3.status.level1.State.FIRE;
import static com.mjm.part3.status.level1.State.SMALL;
import static com.mjm.part3.status.level1.State.SUPER;

/**
 * 查表法
 * 适合状态转换后建, 简单的动作 (加减积分)
 *
 *  如果引入复杂的动作(读写数据库， 发送消息通知 ...)
 * 查表法有一定的局限性
 *
 * @author majunmin
 * @description
 * @datetime 2020/8/25 9:42 下午
 * @since
 */
public class StateMachine {

    private int score;
    private State curState;
    private static final State[][] transitionTable = {
            {SUPER, CAPE, FIRE, SMALL},
            {SUPER, CAPE, FIRE, SMALL},
            {CAPE, CAPE, CAPE, SMALL},
            {FIRE, FIRE, FIRE, SMALL}};
    private static final int[][] actionTable = {
            {+100, +200, +300, +0},
            {+0, +200, +300, -100},
            {+0, +0, +0, -200},
            {+0, +0, +0, -300}};

    public StateMachine() {
        curState = State.SMALL;
        score = 0;
    }

    public void obtainMashRoom() {
        executeEvent(Event.GOT_MUSHROOM);
    }

    private void executeEvent(Event event) {
        Integer curStateCode = curState.getCode();
        int eventCode = event.getCode();
        this.score += actionTable[curStateCode][eventCode];
        this.curState = transitionTable[curStateCode][eventCode];
    }

    public void obtainCape() {
        executeEvent(Event.GOT_CAPE);
    }

    public void obtainFireFlower() {
        executeEvent(Event.GOT_FIRE);
    }

    public void meetMonster() {
        executeEvent(Event.MEET_MONSTER);
    }

    public Integer getScore() {
        return score;
    }

    public State getCurState() {
        return curState;
    }


}
