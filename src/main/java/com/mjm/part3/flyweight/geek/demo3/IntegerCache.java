package com.mjm.part3.flyweight.geek.demo3;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/**
 * Integer 缓存类 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-03-26 19:30
 * @since
 */
public class IntegerCache {

    public static final Map<Integer, WeakReference<Integer>> cache = new WeakHashMap<>();

    private IntegerCache() {
    }

    public static Integer valueOf(int i){
        WeakReference<Integer> cached = IntegerCache.cache.get(i);
        if (Objects.nonNull(cached)) {
            Integer value = cached.get();
            if (Objects.nonNull(value)) {
                return value;
            }
        }

        WeakReference<Integer> val = new WeakReference<>(i);
        IntegerCache.cache.put(i, val);
        return val.get();

    }
}
