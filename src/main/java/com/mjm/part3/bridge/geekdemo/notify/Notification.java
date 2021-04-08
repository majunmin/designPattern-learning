package com.mjm.part3.bridge.geekdemo.notify;

import com.mjm.part3.bridge.geekdemo.sender.MsgSender;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public abstract class Notification {

    protected MsgSender msgSender;

    public Notification(MsgSender msgSender) {
        this.msgSender = msgSender;
    }

    abstract void notify(String msg);

    @Deprecated
    public abstract void notify(NotificationEmergencyLevel level, String msg);
}
