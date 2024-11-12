package Interview.ArrayPrograms.Day2;

public class FindFrequent {
    public static void main(String[] args) {
        getFrequent();
    }

    static void getFrequent() {
        int[] arr = new int[]{2, 3, 3, 5, 6, 6};
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        arr[j] = visited;
                    }
                }
                System.out.println("Frequency of number"+" " + arr[i] +" " +"is" +" "+ count);

            }
        }
    }
}

