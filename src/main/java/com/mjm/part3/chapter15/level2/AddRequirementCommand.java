package com.mjm.part3.chapter15.level2;

/**
 * 增加一项需求 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2019-05-13 17:23
 * @since
 */
public class AddRequirementCommand implements Command {

    @Override
    public void execute() {
        reqGroup.find();
        reqGroup.add();
        reqGroup.plan();
    }
}
