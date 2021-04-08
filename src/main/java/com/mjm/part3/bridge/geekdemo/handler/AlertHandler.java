package com.mjm.part3.bridge.geekdemo.handler;

import com.mjm.part3.bridge.geekdemo.AlertRule;
import com.mjm.part3.bridge.geekdemo.ApiStateInfo;
import com.mjm.part3.bridge.geekdemo.notify.Notification;

public abstract class AlertHandler {

    public AlertRule alertRule;
    public Notification notification;

    public abstract void check(ApiStateInfo stateInfo);
}
