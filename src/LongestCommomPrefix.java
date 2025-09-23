import java.util.Arrays;

public class LongestCommomPrefix {
    public static void main(String[] args) {
        String[] tc3 = {"interview", "internet", "internal"};
        System.out.println( longestCommonPrefix(tc3));
    }
    static public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        int answer=strs[0].length();
        for (int i=0;i<strs.length-1;i++){
            char[] charArrayOne=strs[i].toCharArray();
            char[] charArrayTwo=strs[i+1].toCharArray();
            int count=getNoOfCommoElements(charArrayOne,charArrayTwo);
            if(count==0){
                return "";
            }
            answer=Math.min(count,answer);
        }
        if(strs[0].toCharArray().length==0){
            return "";
        }
        return strs[0].substring(0,answer);
    }
    static public  int getNoOfCommoElements(char[] arrayOne,char[] arrayTwo){
        int firstCommonCount=0;
        for(int i=0;i<Math.min(arrayOne.length,arrayTwo.length);i++){
            if(arrayOne[i]!=arrayTwo[i]){
                break;
            }
            firstCommonCount++;
        }
        return firstCommonCount;
    }

}
