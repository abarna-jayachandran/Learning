package Interview.ArrayPrograms.Day1;

public class RemoveDupliacte {
    public static void main(String[] args) {
        removeDuplicate();
        printDuplicate();

    }

    static  void removeDuplicate(){
        int[] arr1 = {1,3,2,4,3,3,1,6,8,9};
        int visited= -1;
        for(int i = 0; i< arr1.length; i++){
            if(arr1[i]!=-1){
                for(int j = i+1; j< arr1.length; j++){
                    if(arr1[i]== arr1[j]){
                        arr1[j]=visited;
                    }
                }
                System.out.println(arr1[i]);
            }

        }
    }
    static void printDuplicate(){
        int arr[]= {15,45,25,30,45,75,30,12};

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {

                if (arr[i]==arr[j]) {

                    System.out.println(arr[j]);
                }

            }

        }

    }
}
