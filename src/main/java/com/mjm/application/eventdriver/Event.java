package com.mjm.application.eventdriver;


/**
 * Event 所属类型 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-08 00:35
 * @since
 */
public class Event implements Message {


    @Override
    public Class<? extends Message> getType() {
        return getClass();
    }
}
