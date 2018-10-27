package com.mjm.part2.chapter8.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author majun
 * @date 2018/10/23 20:23
 */
public class SingletonFactory {

    private static Singleton instance;

    static {
        try {
            Class<?> aClass = Class.forName(Singleton.class.getName());
            Constructor constor =  aClass.getDeclaredConstructor();
            constor.setAccessible(true);
            instance = (Singleton)constor.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static Singleton getInstance(){
        return instance;
    }
}
