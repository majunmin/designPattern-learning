package com.mjm.part3.listener.thread;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.util.concurrent.TimeUnit;

/**
 * 一句话功能简述 </br>
 * 对线程增加了监控信息,生命周期的回调事件
 *
 * @author majunmin
 * @description
 * @datetime 2021-04-06 20:18
 * @since
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {

        // demo1
        Observable observable = new ObservableThread(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("finsish done");
            return null;
        });
        observable.start();


        // demo2
        TaskLifeCycle<String> lifeCycle = new EmptyLifeCycle<String>(){
            @Override
            public void onDone(Thread t, String result) {
                System.out.println("the result is : " + result);
            }
        };

        Observable observable2 = new ObservableThread<String>(() -> {
            return "hello world";
        }, lifeCycle);
        observable2.start();


        TimeUnit.SECONDS.sleep(5);
    }
}
