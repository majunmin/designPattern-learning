package com.mjm.principle.openclose.demo2;

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
