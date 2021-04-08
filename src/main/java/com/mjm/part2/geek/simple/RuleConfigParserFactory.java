package com.mjm.part2.geek.simple;

import java.util.HashMap;
import java.util.Map;

public class RuleConfigParserFactory {


    private static final Map<String, IRuleConfigParser> cachedParsers = new HashMap<>();

    // 单例模式 + 工厂模式结合
    static {
        cachedParsers.put("json", new JsonRuleConfigParser());
        cachedParsers.put("xml", new XmlRuleConfigParser());
        cachedParsers.put("yaml", new YamlRuleConfigParser());
        cachedParsers.put("properties", new PropertiesRuleConfigParser());
    }

    @Deprecated
    public static IRuleConfigParser createParser(String ruleConfigFilePath, String fileExtension) throws InvalidRuleConfigException {
        IRuleConfigParser parser = null;
        if ("json".equalsIgnoreCase(fileExtension)) {
            parser = new JsonRuleConfigParser();
        } else if ("xml".equalsIgnoreCase(fileExtension)) {
            parser = new XmlRuleConfigParser();
        } else if ("yaml".equalsIgnoreCase(fileExtension)) {
            parser = new YamlRuleConfigParser();
        } else if ("properties".equalsIgnoreCase(fileExtension)) {
            parser = new PropertiesRuleConfigParser();
        } else {
            throw new InvalidRuleConfigException("Rule config file format is not supported: " + ruleConfigFilePath);
        }
        return parser;
    }

    public static IRuleConfigParser createParser(String fileExtension) throws InvalidRuleConfigException {
        IRuleConfigParser parser = cachedParsers.get(fileExtension);
        if (parser == null) {
            throw new InvalidRuleConfigException("Rule config file format is not supported, fileExtension : " + fileExtension);
        }
        return parser;
    }
}
