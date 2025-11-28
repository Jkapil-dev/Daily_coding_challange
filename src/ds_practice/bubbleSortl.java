package ds_practice;

import java.util.Arrays;

public class bubbleSortl {
    static void sort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for(int j=1;j< arr.length-i;j++){
                if(arr[j]< arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] marks={3,2,5,6,1};
        System.out.println("Before sorting: "+Arrays.toString(marks));
        sort(marks);
        System.out.println("After sorting: "+Arrays.toString(marks));
    }
}
