package com.company.stackapp;

import com.company.interfaz.INavigationStack;

public class NavigationStack<T extends Comparable<T>> implements INavigationStack<T> {
    private Stack<T> undostack;
    private Stack<T> rendostack;

    public NavigationStack() {
        undostack = new Stack<T>();
        rendostack = new Stack<T>();
    }

    public void addItem(T item) {

        undostack.push(item);
    }

    public int getUndostackSize() {
        return undostack.getSize();
    }

    public int getRendostackSize() {
        return rendostack.getSize();
    }

    public Object[] getundostack() {

        return undostack.getInternalArray();

    }

    @Override
    public boolean can_undo() {
        return getUndostackSize() > 0 ? true : false;
    }

    @Override
    public boolean can_redo() {

        return getRendostackSize() > 0 ? true : false;
    }

    @Override
    public void redo() {
        undostack.push(rendostack.pop());
    }

    @Override
    public void undo() {
        rendostack.push(undostack.pop());
    }
}
