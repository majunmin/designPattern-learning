package com.mjm.part3.adapter.geek.adapter;

import com.mjm.part3.adapter.geek.CSensitiveWordFilter;
import lombok.Setter;

@Setter
public class CSensitiveFilterAdaptor implements ISensitiveWordsFilter {

    private CSensitiveWordFilter filter;


    @Override
    public String filter(String text) {
        return filter.filter(text, "...");
    }
}
