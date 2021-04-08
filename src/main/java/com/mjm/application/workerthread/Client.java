package com.mjm.application.workerthread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-07 08:58
 * @since
 */
public class Client {

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(1);

        // 会产生死锁
        pool.submit(() -> {
            try {
                String qq = pool.submit(() -> "QQ").get();
                System.out.println(qq);
            } catch (Exception e) {
            }
        });

    }
}
