package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList<>();
        ArrayList arrayList1 = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.set(3, 4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);

        arrayList1.add(11);
        arrayList1.add(22);
        arrayList1.add(33);
        arrayList1.set(3, 44);
        arrayList1.add(55);
        arrayList1.add(66);
        arrayList1.add(77);

        arrayList.addAll(2, arrayList1);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }


            System.out.println("=================================================================");



            for (int b = 0; b < arrayList.size(); b++) {
                System.out.println(arrayList.get(b));
            }
        }
    }





