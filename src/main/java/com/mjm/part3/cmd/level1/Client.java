package com.mjm.part3.cmd.level1;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2019-05-13 17:17
 * @since
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("客户要求增加一个需求");
        Group reqGroup = new RequirementGroup();
        reqGroup.find();
        reqGroup.add();
        reqGroup.plan();
        System.out.println("客户要求增加一个页面");
        Group pageGroup = new PageGroup();
        pageGroup.find();
        pageGroup.add();
        pageGroup.plan();
        System.out.println("客户要求增加一项功能");
        Group codeGroup = new CodeGroup();
        codeGroup.find();
        codeGroup.add();
        codeGroup.plan();
    }
}
