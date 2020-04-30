package com.company;

import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.set(3, 4);
        arrayList.add(5);

        ListIterator listIterator = arrayList.listIterator();

        System.out.println(listIterator.next());
        System.out.println(listIterator.previousIndex() + " Previous");
        System.out.println(listIterator.nextIndex() + " next");
        System.out.println(listIterator.next());


        System.out.println("=================================================================");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}




