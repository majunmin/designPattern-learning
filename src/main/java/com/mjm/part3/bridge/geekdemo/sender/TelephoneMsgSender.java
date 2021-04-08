package com.mjm.part3.bridge.geekdemo.sender;

import lombok.Setter;

import java.util.List;

@Setter
public class TelephoneMsgSender implements MsgSender {
    private List<String> telephones;

    @Override
    public void send(String messsage) {
        // ...

    }
}
