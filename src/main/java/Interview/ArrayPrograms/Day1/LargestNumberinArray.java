package Interview.ArrayPrograms.Day1;

public class LargestNumberinArray {
    public static void main(String[] args) {
        LargeNumber();
    }

    static void LargeNumber() {
        int[] arr = {2, 3, 5, 67, 86, 98};
        int big = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > big) {
                big = arr[i];
            }
        }
        System.out.println(big);

    }

}

