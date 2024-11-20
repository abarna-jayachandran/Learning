package Interview.ArrayPrograms.Day7;

import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {
        int[] arr1= {12,23,45,56,89};
        int[] arr2={23,56,21,99,10};

        HashSet<Integer> hs = new HashSet();
        for(int i = 0 ;i<arr1.length;i++){
          hs.add(arr1[i]);
        }
        for(int j = 0 ; j<arr2.length;j++){
            if(hs.contains(arr2[j])){
                System.out.print(arr2[j]+",");
            }
        }
    }
}
