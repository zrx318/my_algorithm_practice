package com.rongxin.sort;

/**
 * @ClassName XierSortDemo
 * @Author RX_Zhao
 * @Date 16:55
 * @Version
 **/
public class XierSortDemo {
    private static void shellSort(int[] arr) {
        for (int len = arr.length / 2; len > 0; len /= 2) {
            for (int i = len; i < arr.length; i++) {
                int index = i;
                int temp = arr[i];
                if (arr[index] < arr[index - len]) {
                    while (index - len >= 0 && temp < arr[index - len]) {
                        arr[index] = arr[index - len];
                        index -= len;
                    }
                    arr[index] = temp;
                }
            }
        }
    }
}
