package Interview.ArrayPrograms.Day7;

import java.util.HashSet;
import java.util.Iterator;

public class Union {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {4, 5, 6, 7, 8, 9};

        // Union of an Arrays
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            hs.add(arr2[i]);
        }

        //System.out.println(hs);// one way of printing

        Iterator<Integer> i = hs.iterator();
        while (i.hasNext())
            System.out.print(i.next() + ",");


    }


}

