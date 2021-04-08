package com.mjm.part2.geek.abstractfactory;

import com.mjm.part2.geek.simple.RuleConfig;

public interface ISystemRuleConfigParser {
    RuleConfig parse(String content);
}
