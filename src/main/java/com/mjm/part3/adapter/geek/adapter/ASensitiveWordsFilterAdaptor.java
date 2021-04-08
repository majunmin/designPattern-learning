package com.mjm.part3.adapter.geek.adapter;

import com.mjm.part3.adapter.geek.ASensitiveWordsFilter;
import lombok.Setter;

@Setter
public class ASensitiveWordsFilterAdaptor implements ISensitiveWordsFilter {

    private ASensitiveWordsFilter filter;


    @Override
    public String filter(String text) {
        String maskContent = filter.filterSexyWord(text);
        maskContent = filter.filterPoliticalWord(maskContent);
        return maskContent;
    }
}
