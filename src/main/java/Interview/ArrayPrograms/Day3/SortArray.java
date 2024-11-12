package Interview.ArrayPrograms.Day3;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {1,-4,5,7,8,3,9,9,18,18,89};
        int n = arr.length;
        Arrays.sort(arr);
        System.out.println("The Second Largest number is" +" "+arr[n-2]);

    }
}
