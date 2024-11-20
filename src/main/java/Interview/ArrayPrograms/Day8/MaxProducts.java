package Interview.ArrayPrograms.Day8;

public class MaxProducts {
    public static void main(String[] args) {
        int[] arr = {8,7,4,9,2,6};
        int[] sortArray=new int[arr.length];
        for(int i = 0 ;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.print(arr[i]+",");
        }

      /*  for(int i = 0 ;i<arr.length;i++){
            sortArray[i]= arr[i];
        }*/
//        int firstElement = sortArray[sortArray.length-1];
//        int secondElement = sortArray[sortArray.length-2];
//        int product = firstElement*secondElement;
       // System.out.println(product);
        System.out.println((arr[arr.length-1]*(arr[arr.length-2])));


    }
}
