package com.vijfhart.casus.tree;

import java.lang.Iterable;
/**
 * Created by carlo on 7-9-2016.
 */
public interface TreeIterable<T> extends Iterable<T>{
    TreeIterator<T> iterator();
}
