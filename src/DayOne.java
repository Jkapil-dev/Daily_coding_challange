import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class DayOne {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the no. of elements in array!");
        int noOfTerms= scan.nextInt();
        int[] array=new int[noOfTerms];
        int countZero=0;
        int countOne=0;
        for (int i=0;i<noOfTerms;i++){
            System.out.printf("Enter %d th term:",i);
            array[i]=scan.nextInt();
            if(array[i]==0){
                countZero++;
            } else if (array[i]==1) {
                countOne++;
            }
        }
        System.out.println("Unsorted array:"+Arrays.toString(array));

      for(int j=0;j<noOfTerms;j++){
        if(countZero>0)  {
              array[j] = 0;
              countZero--;
          } else if (countOne>0) {
            array[j]=1;
            countOne--;
        }else{
            array[j]=2;
        }
      }
      System.out.println("Sorted array"+Arrays.toString(array));

    }
}
