package Interview.ArrayPrograms.Day8;

import java.util.Arrays;

public class MaximumProducts {
    public static void main(String[] args) {
        int[] arr = {8, -2, 6, -30};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int firstMax = arr[arr.length - 1];
        int secondMax = arr[arr.length - 2];
        int product = firstMax * secondMax;
        System.out.println("The product of maximum number is :" + " " + product);

    }
}
