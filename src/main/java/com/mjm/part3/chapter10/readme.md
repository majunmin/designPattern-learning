#模板方法

###定义
```
Define the skeleton(框架) of an algorithm in an operation, defferring(延迟) some steps to subclass.
Template Method lets subclass redefine certain steps of an algorithm **without changing the algorithm's structure**.
```

###组件Component
基本方法 (具体由子类实现)

模板方法 


###优点
1. 提高代码复用性 
        
    将相同部分的代码放在抽象的父类中
2. 提高了拓展性 

    将不同的代码放入不同的子类中，通过对子类的扩展增加新的行为
3. 实现了反向控制 

    通过一个父类调用其子类的操作，通过对子类的扩展增加新的行为，实现了IOC & 符合 OCP
    
###缺点

1. 引入了抽象类，每一个不同的实现都需要一个子类来实现，导致类的个数增加，从而增加了系统实现的复杂度。


###应用场景
1. 一次性实现一个算法的不变的部分，并将可变的行为留给子类来实现；
2. 各子类中公共的行为应被提取出来并集中到一个公共父类中以避免代码重复；
3. 控制子类的扩展。 