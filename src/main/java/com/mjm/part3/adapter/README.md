#适配器模式(Adapter)

```
Convert the interface of a class into anotjher interface clients expect.Adapter lets classes work together 
that couldn't otherwise because of incompatible interfaces.
```
##适配器模式的通用类图
![适配器模式](./img/adapter.png)

1. Target:目标角色
我们期望的接口，需要将其他类转化成的接口

2. Adapter: 适配器角色
转换角色,将元角色转换为目标角色

3. Adaptee: 源角色
已经存在的对象，需要经过适配器转换为另一个新的对象，来适配其他接口

```java
/**
* target 角色
*/
public interface Target {
    /**
     * 这是源类Adaptee也有的方法
     */
    public void sampleOperation1(); 
    /**
     * 这是源类Adapteee没有的方法
     */
    public void sampleOperation2(); 
}

```

```java
public class Adaptee {
    
    public void sampleOperation1(){}

}
```

```java
public class Adapter extends Adaptee implements Target {
    /**
     * 由于源类Adaptee没有方法sampleOperation2()
     * 因此适配器补充上这个方法
     */
    @Override
    public void sampleOperation2() {
        //写相关的代码
    }

}
```

##适配器模式的应用

类适配器 (通过继承的方式实现)
对象适配器 (通过组合的方式实现)
###优点

1. 扩展性

在写适配器的功能时，可以添加额外的功能，从而扩展系统功能

2. 复用性

系统需要使用现有的类，而现有的类不符合接口的需要，这时适配器模式就派上用场了

3. 灵活性

适配器类似于一个灵活的构件，不用时可以直接剔除。不影响系统。

4. 透明性

上层访问Target目标角色，但具体的实现都委托给了源角色(Adaptee)，而这些对高层次模块来说是透明的。

###缺点

过多的使用适配器，会让系统非常零乱，不易整体进行把握。
比如，明明看到调用的是A接口，其实内部被适配成了B接口的实现，一个系统如果太多出现这种情况，无异于一场灾难。
因此如果不是很有必要，可以不使用适配器，而是直接对系统进行重构。

###注意事项
适配器模式 是用在系统扩展时，将不符合系统设计的时候才考虑使用适配器模式减少代码修改带来的风险
没有一个系统分析师会在系统详细设计时使用适配器模式。





