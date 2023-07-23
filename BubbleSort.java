package com.grind;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {


        int[] a = {2,4,-9,8,56,9};

// We have to compare consecutive nimbers and move the greatest number to the last .

        for(int lastUnsortedIndex = a.length-1; lastUnsortedIndex>0; lastUnsortedIndex--){
            for(int i=0; i<lastUnsortedIndex; i++){
                if(a[i]>a[i+1]){
                    swap(a,i,i+1);
                }
            }
        }
        System.out.println(Arrays.toString(a));



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