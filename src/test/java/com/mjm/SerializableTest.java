package com.mjm;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 1. 单一对象,无继承关系:若想实现序列化与反序列化,则必须实现序列化接口,否则报异常:NotSerializableException
 * 2. 对象间有继承关系,但无引用关系,若想实现序列化与反序列化,则父类必须实现序列化接口或提供无参构造函数,否则报invalidClassException
 * 3. 对象间有继承关系,并且有引用关系,若想实现序列化与反序列化,则父类必须实现序列化接口
 * <p>
 * <p>
 * Created by majunmin on 2018/11/12.
 */
public class SerializableTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.out"));
        oos.writeObject(new Sub("mkj", true));
//        oos.writeObject(new Sub());

        System.out.println(" ========== ");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.out"));
        Super sub = (Super) ois.readObject();
        System.out.println(sub);

//        sub = (Super) ois.readObject();
//        System.out.println(sub);
    }
}

class Super implements Serializable {

    private String name;

//    public Super() {
//        System.out.println("super construct");
//    }

    public Super(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Sub extends Super implements Serializable {

    private static final long serialVersionUID = 3846752112809249244L;

    private boolean fuckable;

    public Sub() {
        super("test");
        System.out.println("sub construct");
    }

    public Sub(String name, boolean fuckable) {
        super(name);
        this.fuckable = fuckable;
        System.out.println("sub construct 2");
    }

    public void setFuckable(boolean fuckable) {
        this.fuckable = fuckable;
    }

    public boolean getFuckable() {
        return fuckable;
    }

    public String toString() {
        return getName() + "-" + getFuckable();
    }
}
