package com.company;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRetainAllDemo {
    public static void main(String[] args) {
        List<String> arrayList1 = new ArrayList<>();
        List<String> arrayList2 = List.of("G", "H", "F");

        arrayList1.add("A");
        arrayList1.add("B");
        arrayList1.add("C");
        arrayList1.add("D");
        arrayList1.add("E");
        arrayList1.add("F");




        System.out.println(arrayList1.get(0));

        arrayList1.addAll(3, arrayList2);
        System.out.println("arrayList1 после добавления " + arrayList1);

        arrayList1.remove(8);
        System.out.println("Размер arrayList после удаления: "
                + arrayList1.size());

        arrayList1.retainAll(arrayList2);
        System.out.println(arrayList1);

        arrayList1.clear();
        System.out.println("arrayList1 после очистки " + arrayList1);
    }
}
