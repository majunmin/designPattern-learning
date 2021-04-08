package com.mjm.principle.polymorphism;

public class Client {

    public static void main(String[] args) {
        DynamicArray dynamicArray = new SortedDynamicArray();
        dynamicArray.add(13);
        dynamicArray.add(14);
        dynamicArray.add(16);
        dynamicArray.add(17);
        dynamicArray.add(15);

        System.out.println(dynamicArray);
    }
}
