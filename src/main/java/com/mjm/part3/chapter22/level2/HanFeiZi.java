package com.mjm.part3.chapter22.level2;

import com.mjm.part3.chapter22.level1.IHanFeiZi;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by majunmin on 2018/12/2.
 */
public class HanFeiZi implements IHanFeiZi, Observerable {

    /**
     * 用于注册观察者
     */
    private List<Observer> observerList = new ArrayList<>();


    @Override
    public void haveBreakfast() {
        System.out.println("韩非子吃饭了。。。");
        this.notifyObservers("breakfast");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子玩耍了。。。");
        this.notifyObservers("fun");
    }

    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers(String context) {
        for (Observer observer : observerList) {
            observer.update(context);
        }
    }
}
