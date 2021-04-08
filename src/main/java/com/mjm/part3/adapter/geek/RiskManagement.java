package com.mjm.part3.adapter.geek;

import com.mjm.part3.adapter.geek.adapter.ISensitiveWordsFilter;

import java.util.List;

// 未使用适配器模式之前的代码：代码的可测试性、扩展性不好
public class RiskManagement {

//    private ASensitiveWordsFilter afilter = new ASensitiveWordsFilter();
//    private BSensitiveWordsFilter bfilter = new BSensitiveWordsFilter();
//    private CSensitiveWordFilter cfilter = new CSensitiveWordFilter();
//
//
//    public String filterSensitiveWord(String content) {
//        String maskText = afilter.filterSexyWord(content);
//        maskText = afilter.filterPoliticalWord(content);
//        maskText = bfilter.filter(content);
//        maskText = cfilter.filter(content, "****");
//        return maskText;
//    }


    // 更适合  扩展 更符合  开闭原则
    private List<ISensitiveWordsFilter> filterList;

    public void registerFilter(ISensitiveWordsFilter filter) {
        filterList.add(filter);
    }

    public String filterSensitiveWord(String content) {
        String maskContent = content;
        for (ISensitiveWordsFilter filter : filterList) {
            maskContent = filter.filter(content);
        }
        return maskContent;
    }
}
