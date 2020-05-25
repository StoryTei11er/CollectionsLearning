package com.company;


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

        Integer list2[] = new Integer[arrayList.size()];

        list2 = (Integer[]) arrayList.toArray(list2);

        for (Integer number : list2){
            System.out.println(number);
        }

        System.out.println("=================================================================");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}




