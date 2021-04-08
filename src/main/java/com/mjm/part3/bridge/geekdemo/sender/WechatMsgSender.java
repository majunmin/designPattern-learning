package com.mjm.part3.bridge.geekdemo.sender;

import lombok.Setter;

import java.util.List;

@Setter
public class WechatMsgSender implements MsgSender {

    private List<String> wechatIds;

    @Override
    public void send(String messsage) {
        // ...
    }
}
