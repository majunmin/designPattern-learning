package com.mjm.principle.openclose.demo2;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Notification {

    private List<String> emails;
    private List<String> telephones;
    private List<String> wechatIds;

    public Notification() {
    }


    public void notify(NotificationEmergencyLevel level, String msg) {

        switch (level) {
            case SERVERE:
                // 自动语音告警
            case URGENCY:
                // wechat
            case NORMAL:
            case TRIVIAL:
                // email
        }
    }
}
