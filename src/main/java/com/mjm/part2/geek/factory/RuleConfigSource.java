package com.mjm.part2.geek.factory;

import com.alibaba.druid.util.StringUtils;
import com.mjm.part2.geek.simple.IRuleConfigParser;
import com.mjm.part2.geek.simple.RuleConfig;

import java.util.Properties;

public class RuleConfigSource {

    public RuleConfig load(String ruleConfigFilePath) throws IllegalAccessException {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);

//        IRuleConfigParserFactory parserFactory = null;
//        if ("json".equals(ruleConfigFileExtension)) {
//            parserFactory = new JsonRuleConfigParserFactory();
//        } else if ("xml".equals(ruleConfigFileExtension)) {
//            parserFactory = new XmlRuleConfigParserFactory();
//        } else if ("yaml".equals(ruleConfigFileExtension)) {
//            parserFactory = new YamlRuleConfigParserFactory();
//        } else if ("properties".equals(ruleConfigFileExtension)) {
//            parserFactory = new PropertiesRuleConfigParserFactory();
//        } else {
//            throw new IllegalAccessException("the config file format not support: " + ruleConfigFilePath);
//        }


        // 使用工厂的工厂
        IRuleConfigParserFactory parserFactory = RuleConfigParserFactoryMap.getParserFactory(ruleConfigFileExtension);
        if (parserFactory == null) {
            throw new IllegalAccessException("the config file format not support: " + ruleConfigFilePath);
        }

        IRuleConfigParser parser = parserFactory.createParser();

        String content = "";
        // content load from configFile
        return parser.parse(content);
    }

    /**
     * 返回 文件 后缀名  a.json  => json
     *
     * @param ruleConfigFilePath
     * @return
     */
    private String getFileExtension(String ruleConfigFilePath) {
        if (StringUtils.isEmpty(ruleConfigFilePath)) {
            return "json";
        }
        return ruleConfigFilePath.substring(ruleConfigFilePath.lastIndexOf(".") + 1);
    }
}
