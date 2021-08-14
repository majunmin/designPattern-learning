package com.mjm.logic;


/**
 * 输出日志  到 消息中间件 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-08-14 11:10
 * @since
 */
public class MessageLogger extends Logger {

    private MessageQueueClient messageQueueClient;

    public MessageLogger(String name, boolean enable, Level minPermittedLevel, MessageQueueClient messageQueueClient) {
        super(name, enable, minPermittedLevel);
        this.messageQueueClient = messageQueueClient;
    }

    @Override
    protected void doLog(Level level, String message) {
        // 格式化 level message 输出到  中间件
        messageQueueClient.send(message);
    }
}
