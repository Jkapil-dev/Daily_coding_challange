public class DayThree {
    public static void main(String[] args){
        int[] array= {2,3,4,1,3};
       int sum=0;
       for(int i=0;i< array.length;i++){
           sum+=array[i];
       }
       int n=array.length;
       int expectedSum= (n-1)*n/2;

       System.out.println("Repeated no:"+(sum-expectedSum));
    }
}
