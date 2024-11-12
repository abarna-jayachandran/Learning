package Interview.ArrayPrograms.Day4;

import java.util.Arrays;

public class RemoveSpecifcElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int element= 4;
        int k=0;
        int[] newArr= new int[arr.length-1];
        for(int i =0; i <arr.length;i++){
            if(arr[i]!=element){
                newArr[k]=arr[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
