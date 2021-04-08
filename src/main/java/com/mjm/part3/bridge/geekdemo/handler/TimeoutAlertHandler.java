package com.mjm.part3.bridge.geekdemo.handler;

import com.mjm.part3.bridge.geekdemo.*;
import com.mjm.part3.bridge.geekdemo.notify.Notification;
import com.mjm.part3.bridge.geekdemo.notify.NotificationEmergencyLevel;

public class TimeoutAlertHandler extends AlertHandler {

    public TimeoutAlertHandler(Notification notification, AlertRule rule) {
        this.notification = notification;
        this.alertRule = rule;
    }

    @Override
    public void check(ApiStateInfo stateInfo) {
        AlertRule alertRule = this.alertRule.getMatchedRule(stateInfo.getApi());
        if (stateInfo.getTimeoutCount() > alertRule.getMaxErrorCount()) {
            notification.notify(NotificationEmergencyLevel.NORMAL, ".....");
        }
    }
}
