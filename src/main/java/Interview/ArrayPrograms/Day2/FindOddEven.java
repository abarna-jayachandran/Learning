package Interview.ArrayPrograms.Day2;

public class FindOddEven {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println("Odd Numbers");
        for(int i=0 ; i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }

        System.out.println("Even Numbers");

        for(int j =0;j<arr.length;j++){
            if(arr[j]%2==0){
                System.out.println(arr[j]);
            }
        }
    }
}
