package com.company;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList<>();

        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        Iterator listIterator = arrayList.iterator();
        System.out.println(listIterator.hasNext());
        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        }
    }



