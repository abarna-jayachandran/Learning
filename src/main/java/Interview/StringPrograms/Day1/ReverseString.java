package Interview.StringPrograms.Day1;

public class ReverseString {
    public static void main(String[] args) {
        String str ="kavin";
        String cs = str.toLowerCase();
        String result =" ";
        for(int i =cs.length()-1;i>=0;i--){
             result += cs.charAt(i);
        }
        System.out.println("The Reversed String is"+ result);

    }
}
