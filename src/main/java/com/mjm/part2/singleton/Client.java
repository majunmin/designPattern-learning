package com.mjm.part2.singleton;

import java.util.stream.IntStream;

/**
 * @author majun
 * @date 2018/10/22 18:06
 */
public class Client {

    public static void main(String[] args) {
        IntStream.range(0, 10).mapToObj(i -> new Thread(() -> {
//            LazySingleton instance = LazySingleton.getInstance();
            HungrySingleton instance = HungrySingleton.getInstance();
            System.out.println(instance);
        })).forEach(Thread::start);
    }
}
