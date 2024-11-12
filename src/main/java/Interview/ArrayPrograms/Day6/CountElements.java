package Interview.ArrayPrograms.Day6;

public class CountElements {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 7, 8, 12};
        int count = 0;
        // int[] temp =
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                count++;
            }
        }
        System.out.println("The count of greater than 5 is :"+count);
    }
}
