package com.mjm.application.guardedsuspension;

import java.util.concurrent.TimeUnit;

/**
 * 一句话功能简述 </br>
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-07 08:28
 * @since
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {
        LockedBlockingQueue<Integer> boundBuffer = new LockedBlockingQueue<>();


        new Thread(() -> {

            try {
                for (int i = 0; i < 100; i++) {
                    boundBuffer.offer(i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                for (int i = 0; i < 100; i++) {
                    System.out.println(boundBuffer.take());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        TimeUnit.SECONDS.sleep(4);

    }
}
