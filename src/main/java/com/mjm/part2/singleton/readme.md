# 单例模式 (Singleton Pattern)
Ensure a class has only one instance, and provide a global point of access to it.
类图如下所示：
![](../img/singleton.png)

#### 单例模式的优点

1. 单例对象在内存中只有一个实例，减少了内存开支 
  特别是一个对象需要频繁创建/销毁时，并且创建/销毁的过程无法优化时，用单例模式特别合适
2. 当一个对象创建时，需要消耗较多的资源(读取配置，产生其他依赖对象)时，可以再系统启动时直接初始化一个对象。（需要注意 JVM 垃圾回机制收）
3. 当系统需要配置全局信息时，优化和共享全局资源
4. 单例模式可以避免对资源的多重占用

#### 单例模式的缺点
1. 单例模式 一般不会是接口，扩展困难，若要扩展，需要修改代码
2. 单例模式 与单一职责原则有冲突
    1. 单一职责原则 要求一个类/接口 功能尽可能单一，而不关心是否是单例对象，是否是单例取决于环境
    2. 而单例模式 要把对象的创建爱你与业务逻辑放在一起
3. 单例模式对测试不利。（不理解）

#### 单例模式的应用场景
1.  全局配置对象
2.  整个项目需要一个全局访问点/ 共享对象
3.  创建一个对象需要消耗过多的资源 如IO操作 线程池 数据库连接池
4.  需要定义大量 静态常量与静态方法 的工具类（当然也可以直接声明为 static）
     [https://my.oschina.net/u/2930289/blog/1923536](https://my.oschina.net/u/2930289/blog/1923536 "工具类: 单例模式  与  静态方法的工具类 区别")

#### 单例模式注意事项

1. 多线程情况下 保障单例
2. 懒加载

#### 单例模式的扩展

产生固定数目的对象

     
