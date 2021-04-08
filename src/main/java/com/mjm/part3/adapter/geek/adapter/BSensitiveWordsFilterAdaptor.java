package com.mjm.part3.adapter.geek.adapter;

import com.mjm.part3.adapter.geek.BSensitiveWordsFilter;
import lombok.Setter;

@Setter
public class BSensitiveWordsFilterAdaptor implements ISensitiveWordsFilter{
    private BSensitiveWordsFilter filter;

    @Override
    public String filter(String text) {
        return filter.filter(text);
    }
}
