package com.mjm.principle.openclose.demo2;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class AlertRule {

    private Integer maxErrorCount;
    private Integer maxTimeoutCount;
    private Integer maxTps;

    private Map<String, AlertRule> cache = new HashMap<>();

    public AlertRule getMatchedRule(String api) {
        return cache.get(api);
    }
}
