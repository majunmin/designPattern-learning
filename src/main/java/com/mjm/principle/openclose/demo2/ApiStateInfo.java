package com.mjm.principle.openclose.demo2;

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
