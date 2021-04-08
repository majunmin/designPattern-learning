package com.mjm.principle.openclose.demo2;

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
