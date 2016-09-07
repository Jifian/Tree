package com.vijfhart.casus.tree;

import java.util.Iterator;

/**
 * Created by carlo on 7-9-2016.
 */
public interface TreeIterator<E> extends Iterator<E> {
    int level();
    void statWith(E node);
    boolean isLeaf();
}
