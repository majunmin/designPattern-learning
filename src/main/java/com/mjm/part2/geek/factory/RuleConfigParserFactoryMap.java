package com.mjm.part2.geek.factory;


import com.alibaba.druid.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class RuleConfigParserFactoryMap {

    public static Map<String, IRuleConfigParserFactory> cachedFactories = new HashMap<>();

    static {
        cachedFactories.put("json", new JsonRuleConfigParserFactory());
        cachedFactories.put("xml", new XmlRuleConfigParserFactory());
        cachedFactories.put("yaml", new YamlRuleConfigParserFactory());
        cachedFactories.put("properties", new PropertiesRuleConfigParserFactory());
    }

    public static IRuleConfigParserFactory getParserFactory(String fileExtension) {
        if (StringUtils.isEmpty(fileExtension)) {
            return null;
        }
        return cachedFactories.get(fileExtension);

    }
}
