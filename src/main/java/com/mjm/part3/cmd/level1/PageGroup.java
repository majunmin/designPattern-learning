package com.mjm.part3.cmd.level1;

/**
 * 美工组 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2019-05-13 17:11
 * @since
 */
public class PageGroup implements Group{

    @Override
    public void add() {
        System.out.println("客户要求增加一个页面");
    }

    @Override
    public void delete() {
        System.out.println("客户要求删除一个页面");
    }

    @Override
    public void change() {
        System.out.println("客户要求修改一个页面");
    }

    @Override
    public void find() {
        System.out.println("客户找到美工组");
    }

    @Override
    public void plan() {
        System.out.println("客户要求美工组变更计划");
    }
}
