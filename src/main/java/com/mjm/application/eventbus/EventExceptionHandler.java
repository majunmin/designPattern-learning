package com.mjm.application.eventbus;


/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-07 13:27
 * @since
 */
public interface EventExceptionHandler {

    void handle(Throwable exception, EventContext context);
}
