package com.mjm.principle.openclose.demo2;

public class ErrorCountAlertHandler extends AlertHandler {

    public ErrorCountAlertHandler(Notification notification, AlertRule rule) {
        this.notification = notification;
        this.alertRule = rule;
    }

    @Override
    public void check(ApiStateInfo stateInfo) {
        AlertRule rule = this.alertRule.getMatchedRule(stateInfo.getApi());
        if (stateInfo.getErrorCount() > rule.getMaxErrorCount()) {
            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
        }
    }
}
