package com.Array_recursion;

public class sort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        boolean result = sort_array(arr);
        System.out.println(result);
    }
    static boolean sort_array(int[] arr)
    {
        return helper( arr, 0);
    }
    static boolean helper(int[] arr, int i){
        if (arr[i] == arr[arr.length-1])
            return true;
        return arr[i] < arr[i+1] && helper(arr, i+1);
    }

}
