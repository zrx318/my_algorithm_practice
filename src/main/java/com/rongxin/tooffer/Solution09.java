package com.rongxin.tooffer;

/**
 *一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 **/
public class Solution09 {
    public int JumpFloorII(int target) {
        if (target == 1) return 1;
        if (target == 2) return 2;

        int[] jump = new int[target + 1];
        jump[1] = 1;
        jump[2] = 2;


        int sum = 3;

        for (int i = 3; i < jump.length; i++) {
            jump[i] = sum + 1;
            sum += jump[i];
        }

        return jump[target];
    }
}
