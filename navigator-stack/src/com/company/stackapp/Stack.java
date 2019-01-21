package com.company.stackapp;

import java.util.Arrays;

public class Stack<T extends Comparable<T>> {
    private static final int INITIAL_CAPACITY = 5;
    private static final int GROWTH_AMOUNT = 5;

    private int size;
    private Object[] internalArray;

    public Stack() {
        this(INITIAL_CAPACITY);
    }

    public Stack(int capacity) {
        internalArray = new Object[capacity];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public T pop() {

        return (T) internalArray[--size];
    }

    public void push(T item) {
        if (getSize() >= internalArray.length) {
            internalArray = Arrays.copyOf(internalArray, internalArray.length + GROWTH_AMOUNT);
        }
        internalArray[getSize()] = item;
        size++;
    }

    public Object[] getInternalArray(){
        return internalArray;
    }

}
