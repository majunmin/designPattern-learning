package com.mjm.part3.chain.level1;

import java.util.ArrayList;
import java.util.Random;

/**
 * 一句话功能简述 </br>
 *
 * 缺点：
 *  1. 职责界定不清晰
 *     对女儿提出的请示，应该在父亲类中做出决定，父亲有责任、有义务处理女儿的请示，因此Father类应该是知道女儿的请求自己处理，
 *     而不是在Client类中进行组装出来，也就是说原本应该是父亲这个类做的事情抛给了其他类进行处理，不应该是这样的。
 *  2. 代码臃肿
 *     Client 代码里 大量的 if else
 *  3. 耦合过重
 *     我们要根据Women的type来决定使用IHandler的那个实现类来处理请求。
 *     有一个问题是：如果IHandler的实现类继续扩展怎么办？修改Client类？与开闭原则违背了！
 *  4. 异常情况欠考虑
 *     妻子只能向丈夫请示吗？如果妻子（比如一个现代女性穿越到古代了，不懂什么“三从四德”）向自己的父亲请示了，父亲应该做何处理？
 *     我们的程序上可没有体现出来，逻辑失败了！
 *
 * @author majunmin
 * @description
 * @datetime 2019-05-13 21:18
 * @since
 */
public class Client {

    public static void main(String[] args) {
        //随机挑选几个女性
        Random rand = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(rand.nextInt(4), "我要出去逛街"));
        }
        //定义三个请示对象
        IHandler father = new Father();
        IHandler husband = new Husband();
        IHandler son = new Son();
        for (IWomen women : arrayList) {
            if (women.getType() == 1) {
                //未结婚少女，请示父亲
                System.out.println("\n--------女儿向父亲请示-------");
                father.handleMessage(women);
            } else if (women.getType() == 2) {
                //已婚少妇，请示丈夫
                System.out.println("\n--------妻子向丈夫请示-------");
                husband.handleMessage(women);
            } else if (women.getType() == 3) {
                //母亲请示儿子
                System.out.println("\n--------母亲向儿子请示-------");
                son.handleMessage(women);
            } else {
                //暂时什么也不做
            }
        }
    }
}
