package com.mjm.application.eventdriver;
/**
 * 为 Event 找到合适的 channel 并进行分配 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-08 08:24
 * @since
 */
public interface DynamicRouter<E extends Message> {

    /**
     * 注册 messageType  到 Channel的关联, 只有注册过的 才能被 Channel 处理
     * @param messageType
     * @param channel
     */
    void registerChannel(Class<? extends E> messageType, Channel<? extends E> channel);


    /**
     * 为channel分配相应的 message
     * @param message
     */
    void dispatch(E message);
}
