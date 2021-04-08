package com.mjm.part3.bridge.geekdemo.notify;

import com.mjm.part3.bridge.geekdemo.sender.MsgSender;

public class ServerNotification extends Notification {

    public ServerNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    void notify(String msg) {
        msgSender.send(msg);
    }

    @Override
    @Deprecated
    public void notify(NotificationEmergencyLevel level, String msg) {

    }
}
