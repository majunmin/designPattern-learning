package com.mjm.logic.filer;

/**
 * 接口的使用 ,定义一组行为 </br>
 * 1. 接口不能包含成员变量(可以包含编译期常量, 默认是  public static final 类型的， Constants)
 * 2. 接口 定义一组行为,只能包含抽象方法 (可以有 default 方法)
 * 3. 类实现接口的时候 必须实现接口的所有抽象方法
 * <p>
 * 接口隔离原则
 * 基于接口而非实现编程
 *
 * @author majunmin
 * @description
 * @datetime 2021-08-14 11:13
 * @since
 */
public interface Filter {
    void doFilter(RpcRequest request);

}
