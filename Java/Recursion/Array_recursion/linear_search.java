
package com.Array_recursion;

import java.util.ArrayList;

public class linear_search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,6};
        int target = 4;
//        boolean result = search(arr,target,0);
        System.out.println(findallIndex(arr,target,0));
    }

     static ArrayList findallIndex(int[] arr, int target, int i) {
        ArrayList<Integer> list = new ArrayList<>();
        if(i == arr.length)
            return list;
        if(arr[i] == target)
            list.add(i);

        ArrayList<Integer> ansFromBelowCalls = findallIndex(arr, target, i+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }

    static boolean search(int[] arr,int target,int i)
    {
       if (i == arr.length) {
           return false;
       }
       return (arr[i] == target) || search(arr,target,i+1);

    }

}
