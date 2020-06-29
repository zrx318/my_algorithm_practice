package com.rongxin.tooffer;

/**
 * 连续子数组的最大和
 */
public class Solution30 {
    public int FindGreatestSumOfSubArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i] + array[i - 1] > array[i] ? array[i] + array[i - 1] : array[i];
            max = max > array[i] ? max : array[i];
        }
        return max;
    }
}
