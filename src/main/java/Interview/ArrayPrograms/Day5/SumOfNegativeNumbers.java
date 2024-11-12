package Interview.ArrayPrograms.Day5;

import java.util.Arrays;

public class SumOfNegativeNumbers {
    public static void main(String[] args) {
        int[] arr = {-10, 10, -80, 20};
        int positive= 0,negative=0;
        int positiveAvg= 0,negativeAvereage=0;

        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]>=0){
                positive+= arr[i];
                positiveAvg=positive/arr.length;

            }
            else {
                negative+=arr[i];
                negativeAvereage=negative/arr.length;
            }
        }
        System.out.println("Sum of Postive numbers are:"+positive );
        System.out.println("Sum of Negative numbers are:"+" "+negative);
        System.out.println("Average of Postive numbers are:"+ positiveAvg);
        System.out.println("Average of Negative numbers are:"+" "+negativeAvereage);

    }
}


