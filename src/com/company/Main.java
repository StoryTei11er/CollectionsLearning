package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Object> arrayList = new ArrayList<>(2);

//      Метод size() работает
//      int arrayListSize = arrayList.size();
//      System.out.println(arrayListSize);

//      Метод isEmpty() работает
//      boolean arrayListIsEmpty = arrayList.isEmpty();
//      System.out.println(arrayListIsEmpty);

//      Метод add() не работает. При попытке записать значение перезамписывается первыый елемент а не следующий.
        boolean arrayListAdd = arrayList.add(11);
        arrayList.add(22);


        System.out.println(arrayListAdd);

        System.out.println(arrayList.size());


//      Метод set() работает
//      int arraySet = (int) arrayList.set(1,256);
//      System.out.println(arraySet);
    }
}
