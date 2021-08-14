package com.mjm.logic;

/**
 * 消息中间件 客户端 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-08-14 11:12
 * @since
 */
public interface MessageQueueClient {
    void send(String message);
}
