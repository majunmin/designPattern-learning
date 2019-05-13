package com.mjm.part3.chapter15.level2;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2019-05-13 17:24
 * @since
 */
public class DeletePageCommand implements Command {
    @Override
    public void execute() {
        pageGroup.find();
        pageGroup.delete();
        pageGroup.plan();
    }
}
