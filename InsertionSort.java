package com.grind;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] intArray = {2,43,23,21,32,-9,-67};
// The sorted array grows from ri8 to left , we search the largest element
// in the u nsorted array and then swap it with the lastunsorted Index. This way the sorted array grows from ri8 to left .
        for(int lastUnsortedIndex = intArray.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
            int largest=0;
            for(int i =1;i<lastUnsortedIndex;i++){
                if(intArray[i]>intArray[largest]){
                  largest =i;
                }
            }
            swap(intArray,largest,lastUnsortedIndex);
        }
        System.out.println(Arrays.toString(intArray));
    }
    public static void swap(int a[], int i , int j){
        if(i==j){
            return;
        }
        int temp=a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
