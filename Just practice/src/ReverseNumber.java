public class ReverseNumber {
    public static void main (String[] args){
        System.out.println(reverse(1534236469));
    }
   static  public int reverse(int x) {

        int reversedNo=0;

        while(x!=0){
            int remainder=x%10;
            x=x/10;
            // Check for overflow before multiplying by 10
            if (reversedNo > Integer.MAX_VALUE / 10 ||
                    (reversedNo == Integer.MAX_VALUE / 10 && remainder > 7)) {
                return 0; // positive overflow
            }
            if (reversedNo < Integer.MIN_VALUE / 10 ||
                    (reversedNo == Integer.MIN_VALUE / 10 && remainder < -8)) {
                return 0; // negative overflow
            }
            reversedNo=reversedNo*10+remainder;

        }
        return reversedNo;
    }
}
