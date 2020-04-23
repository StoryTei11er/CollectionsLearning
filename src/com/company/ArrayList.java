package com.company;

import java.util.*;


public class ArrayList<T> implements List<T> {
    private static final int STANDARD_SIZE = 10;
    private T[] array;
    private int index;


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

    //Сделал
    @Override
    public boolean add(T t) {
        try {
            for (int i = 0; i <= array.length; i++) {
                if (array[i] == null) {
                    array[i] = t;
                    break;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            T[] temp = Arrays.copyOf(array, (array.length * 3) / 2 + 1);
            array = temp;
            for (int i = 0; i <= array.length; i++) {
                if (array[i] == null) {
                    array[i] = t;
                    break;
                }
            }
        }
        return true;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
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
        return true;
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

    //Сделал.
    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == o) {
                this.index = i;
            } else {
                System.out.println("Такого елемента нет в массиве");
                break;
            }
        }
        return index;
    }

    //  Сделал
    @Override
    public int lastIndexOf(Object o) {
        int lastIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == o) {
                lastIndex = i;
            }
        }
        return lastIndex;
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

