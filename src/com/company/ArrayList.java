package com.company;

import java.util.*;


public class ArrayList<T> implements List<T> {
    private static final int STANDARD_SIZE = 10;
    private T[] array;

    public ArrayList(int i) {
        if (i == 0) {
        }
        this.array = (T[]) new Object[i];
    }

    public ArrayList() {
        this.array = (T[]) new Object[STANDARD_SIZE];
    }

    //Сделал.
    @Override
    public int size() {
        System.out.println(array[0] + "индекс 0");
        System.out.println(array[1] + "интедкс 1");

        return array.length;
    }

    //Сделал.
    @Override
    public boolean isEmpty() {
        if (array.length != 0) {
            return false;
        } else {
            return true;
        }
    }

    //Сделал.
    @Override
    public boolean contains(Object o) {
        return indexOf(0) == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    //Сделал.
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    //Сделал.
    @Override
    public T set(int index, T element) {
        array[index] = element;
        return array[index];
    }

    //Сделал.
    @Override
    public void add(int index, T element) {
        array[index] = element;
    }

    @Override
    public boolean add(T t) {
        return true;
    }

    //Сделал.
    @Override
    public T remove(int index) {
        array[index] = null;
        return array[index];
    }

    //Сделал.
    @Override
    public boolean remove(Object o) {
        return indexOf(0) == 0;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        //ignore
        return false;
    }

    //Сделал.
    @Override
    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
    }

    //Сделал.
    @Override
    public T get(int index) {
        return (T) array[index];
    }


    @Override
    public int indexOf(Object o) {

        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}

