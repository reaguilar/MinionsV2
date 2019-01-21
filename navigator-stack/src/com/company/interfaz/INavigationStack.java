package com.company.interfaz;

public interface INavigationStack<T extends Comparable<T>>{
    boolean can_undo();
    boolean can_redo();
    void redo();
    void undo();
}
