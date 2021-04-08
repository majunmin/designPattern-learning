package com.mjm.principle.polymorphism;

public class SortedDynamicArray extends DynamicArray {

    @Override
    public void add(Integer e) {
        ensureCapacity();

        int insertIdx = 0;
        for (int i = size - 1; i >= 0; i--) {
            if (e < elements[i]) {
                elements[i+1] = elements[i];
            } else {
                insertIdx = i + 1;
                break;
            }
        }
        elements[insertIdx] = e;
        size++;
    }
}
