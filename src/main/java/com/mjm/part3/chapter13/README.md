# 原型模式

Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.

UML
[原型模式](./img/)

jdk Cloneable interface, 是一个标机接口，需要复写 Object.clone() 实现对象拷贝


##优点

1. 性能优良
 
原型模式是内存二进制流的拷贝，要比直接new Object()性能要好很多，
特别是在循环体内产生大量对象是，原型模式可以很好体现其优点

2. 逃避构造函数的约束

直接在内存中拷贝，不会执行构造函数。 算不上优点，使用时候要注意

ps:
java 创建对象有四种方式：
1. new Object
2. Reflect newInstance
3. Serializable readObject
4. Cloneable 
 只有4 不需要执行构造函数


##缺点