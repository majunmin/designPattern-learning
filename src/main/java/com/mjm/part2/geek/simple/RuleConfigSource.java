package com.mjm.part2.geek.simple;

import com.alibaba.druid.util.StringUtils;

public class RuleConfigSource {

    public RuleConfig load(String ruleConfigFilePath) throws InvalidRuleConfigException {
        String fileExtension = getFileExtension(ruleConfigFilePath);
        IRuleConfigParser parser = RuleConfigParserFactory.createParser(fileExtension);

        String configContent = "";
        // configContent load from file ruleConfigFilePath
        RuleConfig ruleConfig = parser.parse(configContent);
        return ruleConfig;
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
