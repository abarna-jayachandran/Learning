package Interview.Common;

public class TargetElement {
    int[] arr = {1, 3, 5, 7, 9, 11};
    int target = 12;

    public static void main(String[] args) {
        TargetElement te = new TargetElement();
        te.target();
    }

    public void target() {
        for (int i = 0; i <= arr.length; i++) {
            for (int j = i + 1; j <= arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " " + arr[j]);
                    break;
                }
            }
        }
    }

}
