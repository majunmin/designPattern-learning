package com.mjm.principle.openclose.demo2;


import java.util.ArrayList;
import java.util.List;

public class Alert {
    private List<AlertHandler> alertHandlerList;

    public Alert() {
        alertHandlerList = new ArrayList<>();
    }

    public void registerHandler(AlertHandler handler) {
        alertHandlerList.add(handler);
    }


//    public void check(String api, long requestCount, long errorCount, long durationOfSeconds) {
//        long tps = errorCount / requestCount;
//        if (tps > rule.getMatchedRule(api).getMaxTps()) {
//            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
//        }
//        if (errorCount > rule.getMatchedRule(api).getMaxErrorCount()) {
//            notification.notify(NotificationEmergencyLevel.SERVERE, "...");
//        }
//    }

    public void check(ApiStateInfo stateInfo) {
        alertHandlerList.forEach(handler -> handler.check(stateInfo));
    }
}
