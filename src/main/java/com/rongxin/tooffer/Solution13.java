package com.rongxin.tooffer;

import java.util.Arrays;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Solution13 {

    public void reOrderArray(int [] array) {
        if (array == null || array.length <= 1) return;

        for (int i = 1; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                int cur = i - 1;
                int temp = array[cur + 1];
                while(cur >= 0 && array[cur] % 2 == 0) {//不到基数不停
                    array[cur + 1] = array[cur];
                    cur --;
                }
                array[cur + 1] = temp;
            }
        }
    }
}
