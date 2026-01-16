package ds_practice;

import java.util.Arrays;

public class SelectionSort {
    static void selectionSort(int [] array){
        for (int i = 0; i < array.length-1; i++) {
            int endPos= array.length-i-1;
            int max=0;

            for(int j=1;j<=endPos;j++){
                if(array[j]>array[max])max=j;
            }

            int temp=array[max];
            array[max]=array[endPos];
            array[endPos]=temp;
        }
    }
    public static void main(String[] args){
        int [] array={2,6,0,7,8,1};
        System.out.println("Before sorting: "+ Arrays.toString(array));
        selectionSort(array);
        System.out.println("After sorting: "+Arrays.toString(array));
    }
}
