package com.mjm.part3.bridge.geekdemo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ApiStateInfo {
    private String api;
    private long requestCount;
    private long errorCount;
    private long durationOfSeconds;
    private long timeoutCount;
}
