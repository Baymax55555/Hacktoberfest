package com.sorting;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        bsort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    static void bsort(int[] arr,int r,int c){
        if (r == 0){
            return;
        }
        if(r > c)
        {
            if (arr[c] > arr[c+1]){
                int temp = arr[c+1];
                arr[c+1] = arr[c];
                arr[c] = temp;
            }
            bsort(arr,r,c+1);
        }
        bsort(arr,r-1,0);

    }
}
