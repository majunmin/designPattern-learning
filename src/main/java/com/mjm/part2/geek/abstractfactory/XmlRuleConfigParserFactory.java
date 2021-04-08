package com.mjm.part2.geek.abstractfactory;

public class XmlRuleConfigParserFactory implements IRuleConfigParserFactory{
    @Override
    public IRuleConfigParser createRuleParser() {
        return null;
    }

    @Override
    public ISystemRuleConfigParser createSystemParser() {
        return null;
    }
}
