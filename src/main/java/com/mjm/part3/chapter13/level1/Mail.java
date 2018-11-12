package com.mjm.part3.chapter13.level1;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by majunmin on 2018/11/12.
 */
@Getter
@Setter
public class Mail {

    private String receiver;

//    标题
    private String subject;

//    称谓
    private String appellation;

//    内容
    private String context;

//    落款
    private String tail;

    public Mail(AdvTemplate advTemplate){
        this.context = advTemplate.getAdvContext();
        this.subject = advTemplate.getAdvSubject();
    }
}
