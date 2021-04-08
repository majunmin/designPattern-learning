package com.mjm.principle.polymorphism;

public class DynamicArray {

    public static final int DEFAULT_CAPACITY = 16;

    protected int size;
    private volatile int capacity = DEFAULT_CAPACITY;

    protected Integer[] elements = new Integer[DEFAULT_CAPACITY];

    public Object get(int index) {
        return elements[index];
    }

    public void add(Integer e) {
        ensureCapacity();
        elements[size++] = e;
    }

    protected void ensureCapacity() {
        //...如果数组满了就扩容...代码省略...
    }
}
