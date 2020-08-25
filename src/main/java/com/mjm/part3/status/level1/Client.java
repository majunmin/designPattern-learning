package com.mjm.part3.status.level1;

/**
 * @author majunmin
 * @description
 * @datetime 2020/8/25 7:54 下午
 * @since
 */
public class Client {

    public static void main(String[] args) {
        StateMachine stateMachine = new StateMachine();
        stateMachine.obtainFireFlower();
        System.out.println(stateMachine.getScore());
        System.out.println(stateMachine.getCurState());
    }
}
