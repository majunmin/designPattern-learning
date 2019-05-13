package com.mjm.part3.chapter15.level2;

import com.mjm.part3.chapter15.level1.CodeGroup;
import com.mjm.part3.chapter15.level1.Group;
import com.mjm.part3.chapter15.level1.PageGroup;
import com.mjm.part3.chapter15.level1.RequirementGroup;

/**
 * 抽象命令类 </br>
 *
 * 对客户屏蔽 内部三个组的 分工合作
 *
 * Command 有多个 子类
 * 每多加一项功能  Command 就多一个子类
 *
 * @author majunmin
 * @description
 * @datetime 2019-05-13 17:21
 * @since
 */
public interface Command {

    Group reqGroup = new RequirementGroup();
    Group pageGroup = new PageGroup();
    Group codeGroup = new CodeGroup();

    void execute();
}
