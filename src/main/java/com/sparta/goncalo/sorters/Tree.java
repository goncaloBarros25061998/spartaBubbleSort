package com.sparta.goncalo.sorters;

public interface Tree<E> {
    public boolean isEmpty();
    public void remove(E element);

    public  void insert(E element);

    public int size();
    public int height();

}
