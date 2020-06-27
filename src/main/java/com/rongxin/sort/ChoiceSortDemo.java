package com.rongxin.sort;

/**
 * @ClassName ChoiceSortDemo
 * @Author RX_Zhao
 * @Date 16:38
 *
 *
 **/
public class ChoiceSortDemo {
    private static void choiceSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int index = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] <= min) {
                    index = j;
                    min = arr[j];
                }
            }
            swap(arr, index, i);
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
