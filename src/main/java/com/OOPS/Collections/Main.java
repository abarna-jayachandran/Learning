package com.OOPS.Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        list2.add(34);
        list2.add(58);
        list2.add(98);
        list2.add(76);

        //list2.isEmpty();
        System.out.println(list2);

        List<Integer> vector = new Vector<>();
        vector.add(24);
        vector.add(56);
        vector.add(90);
        System.out.println(vector);

    }
}
