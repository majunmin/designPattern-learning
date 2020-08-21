#代理模式  ***

    Provide a surrogate(代理) or placeHolder(持有人) for another object to control access to it.

### UML

Subject 抽象主题角色

RealSubject 具体主题角色 

被委托角色 被代理角色

Proxy 代理角色

委托类 代理类  他负责对真实角色的应用。
把所有抽象主题类定义的方法限制委托给真是角色实现，并且在真实角色处理完毕前后做预处理与善后工作。

```java
//抽象主题类

public interface Subject{
    
       //定义一个方法
       public void request();

}

//真实主题类

public class RealObject implements Subject{

      //实现方法
      public void request(){
            //业务逻辑这样处理
      }

}

//代理类

public class Proxy implements Subject{

      //要代理那个实现类
     private Subject subject = null;

     //默认代理者
    public Proxy(){
          this.subject = new Proxy();
    }

    //通过构造函数传递代理者

    public Proxy(Object...objects){}

    //实现接口中定义的方法

   public void request(){
          this.before();
          this.subject.request();
          this.after();
   }

   //预处理
  private void before(){
       //do something
  }

  //善后处理
  private void after(){
        //do something
  }

}
```

### 优点
1. 职责清晰

真实角色只关心具体业务，不关心其他非本职工作，通过=后期代理实现完成其他功能

2. 高可扩展性

具体角色随时都会发生变化，但是受到接口的限制。也就是说具体角色发生变化,Proxy代码不需要改变

3. 智能化

动态代理  
将web form 参数传到对象上
Spring AOP


### 使用场景
1. rpc代理
调用远程方法本地使用就像是 调用本地方法[增强本地方法]

2. 缓存场景
spring aop注解

3. 通过继承或者是 实现同一个接口来使用
继承: 可选的扩展某个方法， 缺点是只能继承，无法组合多个类
实现 + 组合: 通过实现接口，组合多个类，有点是灵活， 缺点是不需要扩展的方法也需要进行实现 

#### 代理是有个性的
一个类可以实现多个接口，完成不同的功能耦合。也就是说代理类不仅仅可以实现主题接口，也可以实现其他接口完成不同的任务。
而且代理的目的是在目标方法的基础上做增强，这种增强本职就是对目标对象的的方法进行拦截与过滤。
代理类额外的功能就是代理类的个性


###动态代理
动态代理就是在实现阶段不关心代理谁，而在运行时才决定哪一个对象






