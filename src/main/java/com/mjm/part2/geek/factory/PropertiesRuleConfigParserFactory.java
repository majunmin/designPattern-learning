package com.mjm.part2.geek.factory;

import com.mjm.part2.geek.simple.IRuleConfigParser;
import com.mjm.part2.geek.simple.PropertiesRuleConfigParser;

public class PropertiesRuleConfigParserFactory implements IRuleConfigParserFactory{
    @Override
    public IRuleConfigParser createParser() {
        return new PropertiesRuleConfigParser();
    }
}
