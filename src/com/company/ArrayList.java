package com.company;

import java.util.*;
import java.util.stream.Collectors;


public class ArrayList<T> implements List<T> {


    private static final int STANDARD_SIZE = 10;
    private T[] array;
    private int index;
    private int currentLength;


    public ArrayList(int i) {
        if (i == 0) {
        }
        this.array = (T[]) new Object[i];
        this.currentLength = array.length;
    }

    public ArrayList() {
        this.array = (T[]) new Object[STANDARD_SIZE];
        this.currentLength = array.length;
    }


    // Сделал.
    @Override
    public int size() {
        int size = 0;
        for (T i : array) {
            if (i != null) {
                size++;
            }
        }
        return size;
    }

    // Сделал.
    @Override
    public boolean isEmpty() {
        boolean finderItem = false;
        for (T i : array) {
            if (i != null) {
                finderItem = false;
                break;
            } else
                finderItem = true;
        }
        return finderItem;
    }

    // Сделал.
    @Override
    public boolean contains(Object o) {
        boolean finderElement = false;
        for (T element : array) {
            if (element == o) {
                finderElement = true;
            }
        }
        return finderElement;
    }

    // Сделал
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < currentLength && array[currentIndex] != null;
            }

            @Override
            public T next() {
                if (currentIndex != array.length) {
                    return array[currentIndex++];
                } else {
                    String iteratorNextMessage = "No more element in array, its end!";
                    return (T) iteratorNextMessage;
                }
            }
        };
    }

    // Сделал.
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    // Сделал.
    @Override
    public T set(int index, T element) {
        array[index] = element;
        return array[index];
    }

    // Сделал.
    @Override
    public void add(int index, T element) {
        array[index] = element;
    }

    // Сделал
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

    //Сделал
    @Override
    public <T1> T1[] toArray(T1[] a) {
        T[] copiedArray = (T[]) Arrays.copyOf(array, currentLength, a.getClass());
        return (T1[]) copiedArray;
    }

    // Сделал.
    @Override
    public T remove(int index) {
        array[index] = null;
        return array[index];
    }

    // Сделал.
    @Override
    public boolean remove(Object o) {
        return indexOf(0) == 0;
    }

    //Сделал
    @Override
    public boolean containsAll(Collection<?> c) {
        boolean isContains = false;
        for (T elementOfArray : array) {
            for (Object elementOfC : c) {
                if (elementOfArray == null || elementOfC == null)
                    continue;
                if (elementOfArray.equals(elementOfC)) {
                    isContains = true;
                }
            }
        }
        return isContains;
    }

    //Сделал
    @Override
    public boolean removeAll(Collection<?> c) {
//        Object[] filteredObjects = Arrays.stream(array)
//                .filter(e -> !c.contains(e))
//                .collect(Collectors.toList()).toArray();
//        array = (T[]) filteredObjects;
//        return false;

        boolean isRemoved = false;

        for (int i = 0; i < currentLength; i++) {
            for (Object elementOfc : c) {
                for (Object elementOfArray : array) {
                    if (elementOfArray == null || elementOfc == null)
                        continue;
                    if (elementOfArray.equals(elementOfc)) {
                        array[i] = null;
                        isRemoved = true;
                    }
                }
            }
        }
        return isRemoved;
    }

    //Сделал
    @Override
    public boolean addAll(Collection<? extends T> c) {
        boolean adding = false;
        for (Object e : c) {
            if (add((T) e)) {
                adding = true;
            }
        }
        return adding;

    }

    //Сделал
    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        boolean adding = false;
        for (int i = 0; i < currentLength; i++) {
            if (index == i) {
                for (Object e : c) {
                    add(i, (T) e);
                    i++;
                    adding = true;
                }
            }
        }
        return adding;
    }


    @Override
    public boolean retainAll(Collection<?> c) {
        //ignore
        return false;
    }

    // Сделал.
    @Override
    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
    }

    // Сделал.
    @Override
    public T get(int index) {
        return (T) array[index];
    }

    // Сделал.
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

    //Сделал
    @Override
    public ListIterator<T> listIterator() {
        return new ListIterator<T>() {
            int returnedElement = -1;
            int usedNext = 0;
            int usedPrevious = 0;
            int currentIndex = 0;

            // Сделал
            @Override
            public boolean hasNext() {
                return currentIndex < currentLength && array[currentIndex] != null;
            }

            // Сделал
            @Override
            public T next() {
                usedNext++;
                try {
                    if (currentIndex != currentLength) {
                        returnedElement++;
                        return array[currentIndex++];
                    } else {
                        throw new NoSuchElementException("Array is end, this is your last element:");
                    }
                } catch (NoSuchElementException e) {
                    System.out.println(e.getMessage());
                    return array[currentIndex--];
                }
            }

            // Сделал
            @Override
            public boolean hasPrevious() {
                int previouslyIndex = currentIndex - 1;
                if (currentIndex == 0) {
                    return false;
                } else
                    return currentIndex > 0 && array[previouslyIndex] != null;
            }


            // Сделал
            @Override
            public T previous() {
                usedPrevious++;
                try {
                    if (currentIndex > 0 && currentIndex != currentLength) {
                        returnedElement = currentIndex;
                        return array[currentIndex--];
                    } else {
                        throw new NoSuchElementException("Array haven't negative index, your first element is:");
                    }
                } catch (NoSuchElementException e) {
                    System.out.println(e.getMessage());
                    return array[currentIndex];
                }
            }

            // Сделал
            @Override
            public int nextIndex() {
                int nextIndex = currentIndex + 1;
                return nextIndex;
            }

            // Сделал
            @Override
            public int previousIndex() {
                int previousIndex = currentIndex - 1;
                return previousIndex;
            }

            //Сделал
            @Override
            public void remove() {
                int returnedElement;
                if (this.returnedElement >= 0) {
                    returnedElement = this.returnedElement;
                } else {
                    returnedElement = 0;
                }

                try {
                    if (usedNext != 0 || usedPrevious != 0) {
                        array[returnedElement] = null;
                    } else {
                        throw new IllegalStateException("You not use next() or previous() early");
                    }
                } catch (IllegalStateException e) {
                    System.out.println(e.getMessage());
                }
            }

            //Сделал
            @Override
            public void set(T t) {
                int returnedElement;
                if (this.returnedElement >= 0) {
                    returnedElement = this.returnedElement;
                } else {
                    returnedElement = 0;
                }
                array[returnedElement] = t;

            }

            //Сделал
            @Override
            public void add(T t) {
                currentIndex--;
                array[currentIndex] = t;
                currentIndex++;
            }
        };
    }

    //Сделал
    @Override
    public ListIterator<T> listIterator(int index) {
        return new ListIterator<T>() {
            int returnedElement = -1;
            int usedNext = 0;
            int usedPrevious = 0;
            int currentIndex = index;

            @Override
            public boolean hasNext() {
                return currentIndex < currentLength && array[currentIndex] != null;
            }

            // Сделал
            @Override
            public T next() {
                usedNext++;
                try {
                    if (currentIndex != currentLength) {
                        returnedElement++;
                        return array[currentIndex++];
                    } else {
                        throw new NoSuchElementException("Array is end, this is your last element:");
                    }
                } catch (NoSuchElementException e) {
                    System.out.println(e.getMessage());
                    return array[currentIndex--];
                }
            }

            // Сделал
            @Override
            public boolean hasPrevious() {
                int previouslyIndex = currentIndex - 1;
                if (currentIndex == 0) {
                    return false;
                } else
                    return currentIndex > 0 && array[previouslyIndex] != null;
            }


            // Сделал
            @Override
            public T previous() {
                usedPrevious++;
                try {
                    if (currentIndex > 0 && currentIndex != currentLength) {
                        returnedElement = currentIndex;
                        return array[currentIndex--];
                    } else {
                        throw new NoSuchElementException("Array haven't negative index, your first element is:");
                    }
                } catch (NoSuchElementException e) {
                    System.out.println(e.getMessage());
                    return array[currentIndex];
                }
            }

            // Сделал
            @Override
            public int nextIndex() {
                int nextIndex = currentIndex + 1;
                return nextIndex;
            }

            // Сделал
            @Override
            public int previousIndex() {
                int previousIndex = currentIndex - 1;
                return previousIndex;
            }

            //Сделал
            @Override
            public void remove() {
                int returnedElement;
                if (this.returnedElement >= 0) {
                    returnedElement = this.returnedElement;
                } else {
                    returnedElement = 0;
                }

                try {
                    if (usedNext != 0 || usedPrevious != 0) {
                        array[returnedElement] = null;
                    } else {
                        throw new IllegalStateException("You not use next() or previous() early");
                    }
                } catch (IllegalStateException e) {
                    System.out.println(e.getMessage());
                }
            }

            //Сделал
            @Override
            public void set(T t) {
                int returnedElement;
                if (this.returnedElement >= 0) {
                    returnedElement = this.returnedElement;
                } else {
                    returnedElement = 0;
                }
                array[returnedElement] = t;

            }

            //Сделал
            @Override
            public void add(T t) {
                currentIndex--;
                array[currentIndex] = t;
                currentIndex++;
            }
        };
    }

    //Сделал
    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        T[] subList = Arrays.copyOfRange(array, fromIndex, toIndex);
        return Arrays.asList(subList);
    }
}





