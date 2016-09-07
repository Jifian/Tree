package com.vijfhart.casus.tree;

/**
 * Created by carlo on 7-9-2016.
 */
public interface Node<E extends Node<E>> {
    void setParent();
    E getParent();
}
