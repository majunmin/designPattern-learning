package com.mjm.principle.openclose.demo2;

public abstract class AlertHandler {

    public AlertRule alertRule;
    public Notification notification;

    public abstract void check(ApiStateInfo stateInfo);
}
