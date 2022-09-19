package com.sparta.goncalo.sorters;

public interface Tree<Integer> {
    public boolean isEmpty();
    public void remove(Integer element);

    public  void insert(Integer element);

    public int size();
    public int height();

}
