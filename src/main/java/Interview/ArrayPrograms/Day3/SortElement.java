package Interview.ArrayPrograms.Day3;

public class SortElement {

    public static void main(String[] args) {

        int[] arr = {1, 26, 8, 5, 9, 4, 234, 7};

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
