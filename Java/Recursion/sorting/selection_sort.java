package com.sorting;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        Ssort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void Ssort(int[] arr, int r, int c,int max){
       if(r==0){
           return;
       }
       if(r > c){
           if(arr[c] > arr[max])
           {
               Ssort(arr,r,c+1,c);
           }
           else{
               Ssort(arr,r,c+1,max);
           }
       }else{
           int temp = arr[max];
           arr[max] = arr[r-1];
           arr[r-1] = temp;

           Ssort(arr,r-1,0,0);
       }
    }
}
