package Interview.StringPrograms.Day1;

public class RemoveDuplicate {
    public static void main(String[] args){
        String str="collections";
        String result ="";
        String ch = ""+str.toCharArray();
        for(int i = 0;i<ch.length;i++){
            if(result.contains(ch)){
                continue;
            }
            result=result+ch[i];//result+=ch[i];
        }
        System.out.print(result);
    }
}
