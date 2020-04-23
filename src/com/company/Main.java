package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Object> arrayList = new ArrayList<>();
        List<Object> arrayList2 = new ArrayList<>();

        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        arrayList2.add(1);
        arrayList2.add(3);
        arrayList2.add(5);
        arrayList2.add(6);

        arrayList2.removeAll(arrayList);

         System.out.println(arrayList.iterator());



    }
}
