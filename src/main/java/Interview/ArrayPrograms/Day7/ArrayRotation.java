package Interview.ArrayPrograms.Day7;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int n = arr.length;

        //step 1:
        int[] temp = new int[n- 3];
        int[] temp1 = new int[n - 4];
        for (int i = 0; i < n- 3; i++) {
            temp[i] = arr[i];// [1,2,34]
        }

        //step 2:
        for (int i = 0; i < k; i++) {
            arr[i] = arr[arr.length - k + i];
            //7-3+0=4th element(5)
            //7-3+1=5th element(6)
            //7-3+2=6th elemrnt(7)
            //o/p: 5,6,7,4,5,6,7
        }

        //step 3:
        for (int i = 0; i < arr.length - k; i++) {
            arr[k + i] = temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}