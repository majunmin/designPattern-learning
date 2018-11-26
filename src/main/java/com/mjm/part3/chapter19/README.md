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

##适配器模式的应用
###优点



