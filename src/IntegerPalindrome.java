public class IntegerPalindrome {

    static public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        char[] array=String.valueOf(x).toCharArray();
        int len= array.length;
        int i=0;
        int j=len-1;
        while(i<=j){
            if(array[i]!=array[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isPalindrome(56121));
    }
}
