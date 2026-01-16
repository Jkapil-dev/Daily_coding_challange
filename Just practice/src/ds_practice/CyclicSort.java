package ds_practice;

import java.util.Arrays;

public class CyclicSort {
    static void cyclicSort(int[] arr){
        int i=0;
       while(i< arr.length){
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                int temp=arr[i];
                arr[i]=  arr[correctIndex];
                arr[correctIndex]=temp;
            }else{
                i++;
            }
        }
    }
    public static void main(String[] args){
        int [] array={2,4,3,1};
        System.out.println("Before sorting: "+ Arrays.toString(array));
        cyclicSort(array);
        System.out.println("After sorting: "+Arrays.toString(array));
    }
}
