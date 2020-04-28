package com.company;

import java.util.Iterator;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList<>();

        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.set(7, 7);

        ListIterator listIterator = arrayList.listIterator();

        listIterator.remove();
        System.out.println(listIterator.next());
        System.out.println(listIterator.next() + "asd");
        System.out.println(listIterator.next() + "                das");
        listIterator.remove();
        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        listIterator.remove();
        System.out.println(listIterator.next());

        System.out.println("=================================================================");

        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }
}




