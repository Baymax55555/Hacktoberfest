package com.leetcode;

public class Minimum_Moves_to_Reach_Target_Score {
    public static void main(String[] args) {
        int target = 19;
        int maxDoubles = 2;
        int result = minMoves(target,maxDoubles);
        System.out.println(result);
    }
    static int minMoves(int target, int maxDoubles) {
        return helper(target, maxDoubles,0);
    }

    static int helper(int target, int maxDoubles, int count) {
        if(target > 1 && target % 2 == 0 && maxDoubles > 0)
            return helper(target/2,maxDoubles-1,count +1);
        else if (target > 1 && maxDoubles > 0)
            return helper(target-1,maxDoubles,count+1);

        return count+target-1;
    }

}
