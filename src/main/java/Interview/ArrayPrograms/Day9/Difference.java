package Interview.ArrayPrograms.Day9;

import java.util.Arrays;

public class Difference {
    public static void main(String[] args) {
        int[] arr={3,5,6,9,2,8};
        Arrays.sort(arr);
        int largest = arr[arr.length-1];
        int smallest = arr[0];
        int difference = largest-smallest;
        System.out.println(difference);
    }
}
