package com.rongxin.tooffer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。
 * 请写程序找出这两个只出现一次的数字。
 * <p>
 * //num1,num2分别为长度为1的数组。传出参数
 * //将num1[0],num2[0]设置为返回结果
 */
public class Solution40 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 6, 3, 2, 5, 5};
        Solution40 solution40 = new Solution40();
        int[] n1 = new int[1];
        int[] n2 = new int[1];
        solution40.FindNumsAppearOnce(arr, n1, n2);
        System.out.println(Arrays.toString(n1));
        System.out.println(Arrays.toString(n2));
    }

    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : array) {
            if (map.containsKey(num)) {
                map.put(num, 2);
            } else {
                map.put(num, 1);
            }
        }
        boolean flag = true;
        for (int num : array) {
            Integer integer = map.get(num);
            if (integer == 1) {
                if (flag) {
                    flag = false;
                    num1[0] = num;
                } else {
                    num2[0] = num;
                }
            }
        }
    }
}
