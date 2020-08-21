package com.mjm.part3.prototype.level2;

import com.mjm.part3.prototype.level1.AdvTemplate;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by majunmin on 2018/11/12.
 */
@Getter
@Setter
public class Mail implements Cloneable {

    private String receiver;

    //    标题
    private String subject;

    //    称谓
    private String appellation;

    //    内容
    private String context;

    //    落款
    private String tail;

    public Mail(AdvTemplate advTemplate) {
        this.context = advTemplate.getAdvContext();
        this.subject = advTemplate.getAdvSubject();
    }

    @Override
    protected Mail clone() {
        Mail mail = null;
        try {
            mail = (Mail) super.clone();
        } catch (Exception ex) {
            // TODO: 2018/11/12
        }
        return mail;

    }
}
