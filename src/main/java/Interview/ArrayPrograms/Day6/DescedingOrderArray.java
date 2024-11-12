package Interview.ArrayPrograms.Day6;

import java.util.Arrays;

public class DescedingOrderArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 7, 8, 12};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
