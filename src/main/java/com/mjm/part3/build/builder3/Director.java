package com.mjm.part3.build.builder3;

import com.mjm.part3.build.builder3.builder.BenzBuilder;
import com.mjm.part3.build.builder3.builder.BmwBuilder;
import com.mjm.part3.build.builder3.model.BenzCar;
import com.mjm.part3.build.builder3.model.BmwCar;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by majunmin on 2018/11/10.
 *
 *
 * 下面的 每一个方法 都有一个 this.sequence.clear();
 * this.sequence 引用全都指向一个对象
 * 如果List HashMap定义为 类成员变量是， 在类方法里每次使用时 需要 clear()
 *
 * 遇到的问题
 *   1 List list = Arrays.asList(...);
 *     list.clear() 抛出异常
 *     原因 Java中List.remove(removeRange,clear类似) 报出 UnsupportedOperationException 的错误。
 *         原来该List是一个AbstractList，不支持增删改操作。
 *
 *   2 bmwBuilder.setSequence(this.sequence);  到最后四个对象 输出的结果一样
 *     导致 返回的对象 的 Object.sequence 全指向一个sequence
 *     除非 一次遍历 一次消费， 否则 benzBuilder.setSequence(new ArrayList<>(this.sequence));
 *
 */
public class Director {

    private List<String> sequence = new ArrayList<>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BmwBuilder bmwBuilder = new BmwBuilder();

    /**
     * A 型号 Benz
     */
    public BenzCar getBenzCarA(){
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("alarm");
        this.sequence.add("engineBoom");
        this.sequence.add("stop");
        benzBuilder.setSequence(new ArrayList<>(this.sequence));
        return (BenzCar) benzBuilder.getCarModel();
    }

    /**
     * A 型号 BMW
     */
    public BmwCar getBmwCarA(){
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("alarm");
        this.sequence.add("stop");
        bmwBuilder.setSequence(new ArrayList<>(this.sequence));
        return (BmwCar) bmwBuilder.getCarModel();
    }

    /**
     * B 型号 Benz
     */
    public BenzCar getBenzCarB(){
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("alarm");
        this.sequence.add("engineBoom");
        benzBuilder.setSequence(new ArrayList<>(this.sequence));
        return (BenzCar) benzBuilder.getCarModel();
    }

    /**
     * B 型号 Bmw
     */
    public BmwCar getBmwCarB(){
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("alarm");
        this.sequence.add("alarm");
        this.sequence.add("stop");
        bmwBuilder.setSequence(new ArrayList<>(this.sequence));
        return (BmwCar) bmwBuilder.getCarModel();
    }
}
