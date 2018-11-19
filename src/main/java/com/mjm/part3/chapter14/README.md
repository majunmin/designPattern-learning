# 中介者模式

Define an object that encapsulates how a set of objects interact.
Mediator promotes loose couping by keeping objects from referring to each other explicity, and it
let you vary their interaction independently.

Mediator 抽象中介模式
抽象中介者提供统一的接口实现各个同事角色的通信

Concrete Mediator 具体中介者角色
具体中介者通过协调各个同事角色实现协作行为，因此它必须依赖各个同事角色

Colleague  同事角色
每一个同事角色需要与其他的同事角色通信时，需要通过中介者。

*****通用源码*****

```java
/**
* 抽象中介者
*/
@Getter
@Setter
public abstract class Mediator{
    protected ConcreteColleague1 c1;
    protected ConcreteColleague2 c2;
    
    //...
    
    public abstract void doSomething1();
    public abstract void doSomething2();
}
```

```java
/**
* 具具体中介者
*/
public class ConcreteMediator extends Mediator{
    public void doSomething1(){
        /**
        * 调用同事类方法 只要是public 都可以调用 
        */
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }
    
    public void doSomething2(){
           super.c1.selfMethod1();
           super.c2.selfMethod2(); 
    }
}
```

```java
/**
* 抽象同事类
*/
public abstract class Colleague {
    protected Mediator mediator;
    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }
}
```

```java
/**
* 具体同事类 ...多个
*/
public class ConcreteColleague extends Colleague {
    
    public Colleague(Mediator mediator){
        super(mediator);
    }
    
    public void selfMerthod(){
        //自有方法
    }
    
    public void depMethid(){
        //依赖方法
        super.mediator.doSomething();
    }
}
```

   同事类必须有中介者（constructor 构造方法）
   中介者可以有部分同事类（get/set方法注入）
   
##中介者模式优点

减少类间依赖，把原有的一对多的依赖变为一对一的依赖，同事类只依赖中介者，减少了依赖，同时也降低了雷剑的耦合

##中介模式缺点
中介者会膨胀的很大，而且逻辑复杂，原来N个对象的直接相互依赖,转变为中介者与同事类之间的依赖，同事类越多，中介者越复杂。

## 使用场景


