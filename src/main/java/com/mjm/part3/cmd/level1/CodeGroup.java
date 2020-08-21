package com.mjm.part3.cmd.level1;

/**
 * 代码组 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2019-05-13 17:13
 * @since
 */
public class CodeGroup implements Group {
    @Override
    public void add() {
        System.out.println("客户要求增加功能");
    }

    @Override
    public void delete() {
        System.out.println("客户要求删除功能");
    }

    @Override
    public void change() {
        System.out.println("客户要求修改功能");
    }

    @Override
    public void find() {
        System.out.println("客户找到代码组");
    }

    @Override
    public void plan() {
        System.out.println("客户要求变更计划");
    }
}
