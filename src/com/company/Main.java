package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Object> arrayList =  new ArrayList<>();
        List<Object> arrayList1 =  new ArrayList<>(0);

        arrayList.add(1);
        arrayList.add(66);
        arrayList.size();
        arrayList.isEmpty();
        Object t = arrayList.get(0);
        Object t1 = arrayList.contains("1");

        System.out.println(t);
        System.out.println(t1);


//        Object t2 = arrayList.set(2,1);

//        System.out.println(t2);



    }
}
