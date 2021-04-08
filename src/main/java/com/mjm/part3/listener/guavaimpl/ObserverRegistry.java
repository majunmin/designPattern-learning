package com.mjm.part3.listener.guavaimpl;

import com.google.common.base.Preconditions;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author majunmin
 * @description
 * @datetime 2020/8/4 12:39 上午
 * @since
 */
public class ObserverRegistry {

    private Map<Class<?>, CopyOnWriteArraySet<ObserverAction>> registry = new HashMap<>();

    public void register(Object observer) {

        Map<Class<?>, List<ObserverAction>> allObserverActions = findAllObserverActions(observer);

        for (Map.Entry<Class<?>, List<ObserverAction>> entry : allObserverActions.entrySet()) {
            Class<?> eventType = entry.getKey();
            List<ObserverAction> observerActions = entry.getValue();
            CopyOnWriteArraySet<ObserverAction> registeredEventActions = registry.get(eventType);
            if (Objects.isNull(registeredEventActions)) {
                registry.putIfAbsent(eventType, new CopyOnWriteArraySet<>());
                registeredEventActions = registry.get(eventType);
            }
            registeredEventActions.addAll(observerActions);

        }
    }

    private Map<Class<?>, List<ObserverAction>> findAllObserverActions(Object observer) {
        Map<Class<?>, List<ObserverAction>> result = new HashMap<>();
        Class<?> clazz = observer.getClass();
        for (Method method : getAnnotatedMethods(clazz)) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?> eventType = parameterTypes[0];
            ObserverAction observerAction = new ObserverAction(observer, method);
            if (!result.containsKey(eventType)) {
                result.put(eventType, new ArrayList<>());
            }
            result.get(eventType).add(observerAction);
        }
        return result;
    }

    private List<Method> getAnnotatedMethods(Class<?> clazz) {
        List<Method> annotatedMethods = new ArrayList<>();
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Subscribe.class)) {
                Preconditions.checkArgument(method.getParameterCount() == 1,
                        "Method %s has @Subscribe annotation but has %s parameters."
                                + "Subscriber methods must have exactly 1 parameter.",
                        method, method.getParameterCount());
                annotatedMethods.add(method);
            }
        }
        return annotatedMethods;
    }

//    public void unRegister(Object object) {
//        object.getClass()
//
//    }

    public Set<ObserverAction> getMatchObservers(Object event) {
        return registry.get(event.getClass());
    }
}
