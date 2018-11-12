package com.mjm;

import java.io.*;

/**
 * Created by majunmin on 2018/11/12.
 */
public class SerializableTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.out"));
        oos.writeObject(new Sub("mkj", true));

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.out"));
        Super sub = (Super) ois.readObject();
        System.out.println(sub);
    }
}

class Super implements Serializable{

    private String name;

    public Super() {
        System.out.println("super construct");
    }

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

class Sub extends Super  implements Serializable {

    private static final long serialVersionUID = 3846752112809249244L;

    private boolean fuckable;

    public Sub(){
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
        return getName()+getFuckable();
    }
}
