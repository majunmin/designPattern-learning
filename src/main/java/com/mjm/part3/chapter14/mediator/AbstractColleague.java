package com.mjm.part3.chapter14.mediator;

/**
 * @author majun
 * @date 2018/11/19 23:34
 */
public class AbstractColleague {

    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator){
        this.mediator = mediator;
    }
}
