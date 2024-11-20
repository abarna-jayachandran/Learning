package Interview.ArrayPrograms.Day8;

import java.util.Arrays;

public class ArrangeEvenOdd {
    public static void main(String[] args) {
        int[]arr={5,3,2,9,7};
        int n = arr.length;
        int[] temp = new int[n-1];
        int k =0;
        for(int i = 0;i<n ;i++){
                if(arr[i]%2 !=0){
                    temp[k]=arr[i];
                    k++;
                }


        }

        System.out.println(Arrays.toString(temp));
    }
}
