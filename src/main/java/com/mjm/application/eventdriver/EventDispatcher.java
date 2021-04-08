package com.mjm.application.eventdriver;

import java.util.HashMap;
import java.util.Map;

/**
 * 一句话功能简述 </br>
 * 非线程安全
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-08 08:38
 * @since
 */
public class EventDispatcher implements DynamicRouter<Message> {

    /**
     * 保存 messageType 到 Channel的 路由关系
     */
    private final Map<Class<? extends Message>, Channel> routerTable;

    public EventDispatcher() {
        this.routerTable = new HashMap<>();
    }

    @Override
    public void registerChannel(Class<? extends Message> messageType, Channel<? extends Message> channel) {
        routerTable.put(messageType, channel);
    }

    @Override
    public void dispatch(Message message) {
        if (routerTable.containsKey(message.getType())) {
            routerTable.get(message.getType()).dispatch(message);
        } else {
            throw new MessageMatcherException("cannot match the channel for [" + message.getType() + "] type");
        }
    }
}
