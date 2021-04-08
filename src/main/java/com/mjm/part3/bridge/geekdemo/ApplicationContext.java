package com.mjm.part3.bridge.geekdemo;


import com.mjm.part3.bridge.geekdemo.handler.ErrorCountAlertHandler;
import com.mjm.part3.bridge.geekdemo.handler.TimeoutAlertHandler;
import com.mjm.part3.bridge.geekdemo.handler.TpsAlertHandler;
import com.mjm.part3.bridge.geekdemo.notify.Notification;

public class ApplicationContext {

    private AlertRule alertRule;
    private Notification notification;
    private Alert alert;

    private static final ApplicationContext applicationContext = new ApplicationContext();

    private ApplicationContext() {
        initializingBean();
    }

    private void initializingBean() {
        alertRule = new AlertRule();
//        notification = new Notification();
        alert = new Alert();
        alert.registerHandler(new ErrorCountAlertHandler(notification, alertRule));
        alert.registerHandler(new TpsAlertHandler(notification, alertRule));
        alert.registerHandler(new TimeoutAlertHandler(notification, alertRule));
    }

    public static ApplicationContext getInstance() {
        return applicationContext;
    }

    public Alert getAlert() {
        return alert;
    }
}
