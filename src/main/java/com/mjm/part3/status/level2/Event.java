package com.mjm.part3.status.level2;

/**
 * @author majunmin
 * @description
 * @datetime 2020/8/25 9:41 下午
 * @since
 */
public enum Event {
    GOT_MUSHROOM(0),
    GOT_CAPE(1),
    GOT_FIRE(2),
    MEET_MONSTER(3);

    private int code;

    private Event(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }
}
