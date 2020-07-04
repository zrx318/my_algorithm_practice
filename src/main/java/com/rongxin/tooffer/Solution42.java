package com.rongxin.tooffer;

import java.util.ArrayList;

/**
 * 输入一个递增排序的数组和一个数字S，
 * 在数组中查找两个数，使得他们的和正好是S，
 * 如果有多对数字的和等于S，输出两个数的乘积最小的。
 * <p>
 * 输出描述:
 * 对应每个测试案例，输出两个数，小的先输出。
 */
public class Solution42 {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        if (array == null || array.length == 0) {
            return list;
        }

        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int v = array[left] + array[right];
            if (v == sum) {
                if (list.isEmpty()) {
                    list.add(array[left]);
                    list.add(array[right]);
                } else {
                    if (list.indexOf(0) * list.indexOf(1) > array[left] * array[right]) {
                        list.add(0, array[left]);
                        list.add(1, array[right]);
                    }
                }
                left++;
            } else if (v < sum) {
                left++;
            } else {
                right--;
            }
        }
        return list;
    }
}
