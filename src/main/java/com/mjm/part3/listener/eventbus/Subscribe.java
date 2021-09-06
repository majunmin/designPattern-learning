package com.mjm.part3.listener.eventbus;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * markedInterface
 * 标记观察者的那个接口可以接收消息 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-09-06 10:51
 * @since
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Subscribe {


}
