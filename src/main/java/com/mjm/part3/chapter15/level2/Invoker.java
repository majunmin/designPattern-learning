package com.mjm.part3.chapter15.level2;

/**
 * 负责人 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2019-05-13 17:26
 * @since
 */
public class Invoker {

    // 什么命令
    private Command command;

    public Invoker(){}

    public Invoker(Command command){
        this.command = command;
    }

    public void setCommand(Command command){
        this.command = command;
    }

    public void action(){
        this.command.execute();
    }
}
