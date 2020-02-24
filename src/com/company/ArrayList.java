package com.company;

import java.util.*;


public class ArrayList<T> implements List<T> {
    private T[] array;
    private int size = 0;
    private static final int STANDARD_SIZE = 10;

    public ArrayList(int i) {
        if (i == 0) {
            throw new RuntimeException("ТЫ ДОЛБОЁБ, САМ ДУРАК");
        }
        this.array = (T[]) new Object[i];
    }

    public ArrayList() {
        this.array = (T[]) new Object[STANDARD_SIZE];
    }

    @Override
    public int size() {
        if (isEmpty()) {
            System.out.println("Size is 0");
            return 0;
        } else {
            System.out.println("Size is: " + array.length);
            return array.length;
        }
    }


    @Override
    public boolean isEmpty() {
        if (array.length != 0) {
            System.out.println("Lis is not empty ");
            return false;
        } else {
            System.out.println("Lis is empty ");
            return true;
        }
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(0) == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        T[] temp = Arrays.copyOf(array, array.length + 1);
        temp[array.length] = t;
        array = temp;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
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

    @Override
    public void clear() {


    }

    @Override
    public T get(int index) {
        return (T) array[index];
    }


    @Override
    public T set(int index, T element) {
        array[index] = element;
        return array[index];
    }


    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
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

