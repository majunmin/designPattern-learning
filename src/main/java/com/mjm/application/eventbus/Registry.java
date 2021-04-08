package com.mjm.application.eventbus;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Collectors;

/**
 * 一句话功能简述 </br>
 * Registry 是给  Bus内部使用的,不能暴露给外部
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-07 13:11
 * @since
 */
class Registry {

    // 存储 subscriber 和 Topic之间关系的map
    private Map<String, ConcurrentLinkedQueue<Subscriber>> subscriberContainer
            = new ConcurrentHashMap<>();


    /**
     * @param subscriberObj 原始对象
     */
    public void bind(Object subscriberObj) {
        // 获取 Subscriber 的 方法集合,然后进行绑定
        List<Method> methods = getSubscriberMethods(subscriberObj);
        methods.forEach(m -> tierSubscriber(subscriberObj, m));

    }

    /**
     * @param subscriberObj 原始对象
     */
    public void unbind(Object subscriberObj) {
        // unbind 为了提高速度 只对 subscriber 进行失效操作
        subscriberContainer.forEach((key, queue) -> {
            queue.forEach(s -> {
                if (s.getSubscribeObject() == subscriberObj) {
                    s.setDisable(true);
                }
            });
        });
    }

    public ConcurrentLinkedQueue<Subscriber> scanSubscriber(final String topic) {
        return subscriberContainer.get(topic);
    }

    private List<Method> getSubscriberMethods(Object subscriberObj) {
        Class<?> subscriberClass = subscriberObj.getClass();
        // 获取 当前类和 父类所有的 {@link Subscribe} 方法
        Method[] declaredMethods = subscriberClass.getDeclaredMethods();

        // 只有 public && 只有一个参数  && 被 @Subscribe 标注的方法 才 符合回调方法
        return Arrays.stream(declaredMethods).filter(m -> m.isAnnotationPresent(Subscribe.class)
                && m.getParameterCount() == 1
                && m.getModifiers() == Modifier.PUBLIC).collect(Collectors.toList());
    }


    private void tierSubscriber(Object subscriberObj, Method method) {
        Subscribe subscribe = method.getDeclaredAnnotation(Subscribe.class);
        String topic = subscribe.topic();
        subscriberContainer.computeIfAbsent(topic, key -> new ConcurrentLinkedQueue<>());
        subscriberContainer.get(topic).add(new Subscriber(subscriberObj, method));
    }
}
