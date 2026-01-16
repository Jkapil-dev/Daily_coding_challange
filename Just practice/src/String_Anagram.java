import java.util.Arrays;

public class String_Anagram {

    public static void main(String[] args){



    }
    public boolean isAnagram(String s, String t) {
        char[] sCharArray=s.replaceAll(" ","").toCharArray();
        char[] tCharArray=t.replaceAll(" ","").toCharArray();
        sort(sCharArray);
        sort(tCharArray);
        return Arrays.equals(sCharArray,tCharArray);



    }
    static void sort(char[] array){
        for (int i = 0; i < array.length-1; i++) {
            for(int j=i+1;j>0;j--){
                if(array[j]<array[j-1]){
                    char temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
            }
        }
    }

}
