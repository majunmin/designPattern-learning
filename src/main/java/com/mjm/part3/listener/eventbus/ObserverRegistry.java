package com.mjm.part3.listener.eventbus;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observer;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * Observer注册表 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-09-06 10:56
 * @since
 */
public class ObserverRegistry {
    // eventType -> observerActions
    private Map<Class<?>, CopyOnWriteArraySet<ObserverAction>> registry = new ConcurrentHashMap<>();


    public void register(Object observer) {
        Map<Class<?>, Collection<ObserverAction>> observerActions = findAllObserverActions(observer);

        observerActions.forEach((eventType, actions) -> {
            registry.putIfAbsent(eventType, new CopyOnWriteArraySet<>());
            registry.get(eventType).addAll(actions);
        });
    }

    private Map<Class<?>, Collection<ObserverAction>> findAllObserverActions(Object observer) {
        Map<Class<?>, Collection<ObserverAction>> observerActions = new HashMap<>();
        Class<?> clazz = observer.getClass();
        List<Method> annotatedMethods = getAnnotatedMethod(clazz);
        for (Method method : annotatedMethods) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?> eventType = parameterTypes[0];
            observerActions.computeIfAbsent(eventType, key -> new ArrayList<>());
            observerActions.get(eventType).add(new ObserverAction(observer, method));
        }
        return observerActions;
    }

    private List<Method> getAnnotatedMethod(Class<?> clazz) {
        List<Method> result = new ArrayList<>();
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Subscribe.class) && method.getParameterCount() == 1) {
                result.add(method);
            }
        }
        return result;
    }

    public List<ObserverAction> getMatchedObserverActions(Object event) {
        List<ObserverAction> matchedActions = new ArrayList<>();
        final Class<?> postedEventType = event.getClass();
        registry.forEach((eventType, actions) -> {
            if (eventType.isAssignableFrom(postedEventType)) {
                matchedActions.addAll(actions);
            }
        });
        return matchedActions;
    }
}
