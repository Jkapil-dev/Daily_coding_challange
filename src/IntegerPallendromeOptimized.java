public class IntegerPallendromeOptimized {
   static public int reverse(int x) {

        int reversedNo=0;

        while(x!=0){
            int remainder=x%10;
            x=x/10;
            reversedNo=reversedNo*10+remainder;

        }
        return reversedNo;
    }
   static public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int revNo=reverse(x);
        if(x!=revNo){
            return false;
        }
        return true;

    }
    public static void main(String[] args){
        System.out.println(isPalindrome(56121));
    }
}
