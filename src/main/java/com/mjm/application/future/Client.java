package com.mjm.application.future;

import java.util.concurrent.TimeUnit;

/**
 * Client </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-06 15:14
 * @since
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {
        FutureServiceImpl<String, Integer> futureService = new FutureServiceImpl<>();
        Future<Integer> future = futureService.submit((s) -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return s.length();
        }, "hello");

        System.out.println(future.get());
    }
}
