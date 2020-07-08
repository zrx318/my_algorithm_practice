package com.rongxin.tooffer;

import java.util.Arrays;

/**
 * 题目描述
 * 给你一根长度为n的绳子，请把绳子剪成整数长的m段（m、n都是整数，n>1并且m>1，m<=n），
 * 每段绳子的长度记为k[1],...,k[m]。请问k[1]x...xk[m]可能的最大乘积是多少？
 * 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 * <p>
 * <p>
 * 输入描述:
 * 输入一个数n，意义见题面。（2 <= n <= 60）
 * 输出描述:
 * 输出答案。
 */
public class Solution67 {
    public static void main(String[] args) {
        Solution67 s = new Solution67();
        int i = s.cutRope(15);
        System.out.println(i);
    }
    public int cutRope(int target) {
        if (target <= 2) {
            return 1;
        }
        if (target == 3){
            return 2;
        }
        int[] dp = new int[target + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        for (int i = 4; i <= target; i++) {
            int max = 0;
            for (int j = 1; j <= i -1 ; j++) {
                max = Math.max(dp[j]*dp[i-j],max);
            }
            dp[i] = max;
        }
        return dp[target];
    }
}
