package com.vijfhart.casus.tree;

/**
 * Created by carlo on 7-9-2016.
 */
public class NameNode implements Node<NameNode>{
    @Override
    public void setParent() {

    }

    @Override
    public NameNode getParent() {
        return null;
    }

    public boolean isLeaf()
    {
        return false;
    }
}
