package com.mjm.part3.bridge.geekdemo.handler;

import com.mjm.part3.bridge.geekdemo.*;
import com.mjm.part3.bridge.geekdemo.notify.Notification;
import com.mjm.part3.bridge.geekdemo.notify.NotificationEmergencyLevel;

public class TpsAlertHandler extends AlertHandler {

    public TpsAlertHandler(Notification notification, AlertRule rule) {
        this.notification = notification;
        this.alertRule = rule;
    }


    @Override
    public void check(ApiStateInfo stateInfo) {
        AlertRule rule = this.alertRule.getMatchedRule(stateInfo.getApi());
        if (stateInfo.getErrorCount() / stateInfo.getRequestCount() > rule.getMaxTps()) {
            notification.notify(NotificationEmergencyLevel.SERVERE, "....");
        }
    }
}
