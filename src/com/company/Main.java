package com.company;


import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.set(3, 4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);

        List list = arrayList.subList(0,3);
        System.out.println(list);

        System.out.println("=================================================================");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}




