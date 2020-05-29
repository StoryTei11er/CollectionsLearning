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

        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);


        System.out.println(arrayList.removeAll(arrayList1));


            System.out.println("=================================================================");



            for (int b = 0; b < 10; b++) {
                System.out.println(arrayList.get(b));
            }
        for (int b = 0; b < arrayList.size(); b++){
            System.out.println(arrayList1.get(b) + " second array");
        }
        }
    }





