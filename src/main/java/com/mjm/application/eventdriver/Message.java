package com.mjm.application.eventdriver;

public interface Message {

    /**
     * 返回 message 类型
     *
     * @return
     */
    Class<? extends Message> getType();
}
