package ds_practice;

import java.util.Arrays;

public class InserionSort {
    static void insertionSort(int[] arr){
        for(int i=0;i< arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int [] array={2,6,0,7,8,1};
        System.out.println("Before sorting: "+ Arrays.toString(array));
        insertionSort(array);
        System.out.println("After sorting: "+Arrays.toString(array));
    }
}
