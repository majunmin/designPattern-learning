package com.mjm.part3.cmd.level1;

/**
 * 需求组 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2019-05-13 17:09
 * @since
 */
public class RequirementGroup implements Group{
    @Override
    public void add() {
        System.out.println("客户要求增加一项需求");
    }

    @Override
    public void delete() {
        System.out.println("客户要求删除一项需求");
    }

    @Override
    public void change() {
        System.out.println("客户要求修改一项需求");
    }

    @Override
    public void find() {
        System.out.println("客户找到需求组");
    }

    @Override
    public void plan() {
        System.out.println("客户要求需求 变更计划");
    }
}
