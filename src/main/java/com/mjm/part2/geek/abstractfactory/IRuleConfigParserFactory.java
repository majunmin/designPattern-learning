package com.mjm.part2.geek.abstractfactory;

public interface IRuleConfigParserFactory {
    IRuleConfigParser createRuleParser();
    ISystemRuleConfigParser createSystemParser();
}
