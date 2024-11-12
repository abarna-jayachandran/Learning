package Interview.ArrayPrograms.Day3;

import java.util.Arrays;

public class PrintRevereseOrder {
    public static void main(String[] args) {
        reverse();
    }
    static void reverse(){
        int[] a= {10,20,30,40,50};
        System.out.println("Before reversing an array");
        for(int i=0; i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("After reversing an array");
        for(int j = a.length-1;j>=0;j--){
            System.out.println(a[j]);
        }

    }

    static void reverse1(){
        int[] arr= {1,2,3,4,5};
        int i=0; int j=arr.length-1;int temp;
        while(i<j){
            temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.print(Arrays.toString(arr));




    }
}
