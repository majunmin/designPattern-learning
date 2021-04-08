package com.mjm.part3.bridge.geekdemo.notify;

import com.mjm.part3.bridge.geekdemo.sender.MsgSender;

public class UrgencyNotification extends Notification{

    public UrgencyNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    void notify(String msg) {
        msgSender.send(msg);
    }

    @Override
    public void notify(NotificationEmergencyLevel level, String msg) {

    }
}
