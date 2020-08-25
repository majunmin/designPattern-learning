package com.mjm.part3.status.level1;

/**
 * @author majunmin
 * @description
 * @datetime 2020/8/25 6:09 下午
 * @since
 */
public enum State {
    SMALL(0), SUPER(1), FIRE(2), CAPE(3);
    private int code;

    State(int code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
