package com.mjm.application.eventdriver;
/**
 * 负责处理每一种类型的消息 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-08 08:22
 * @since
 */
public interface Channel<E extends Message> {

    /**
     * 负责 message 调度
     * @param message
     */
    void dispatch(E message);
}
