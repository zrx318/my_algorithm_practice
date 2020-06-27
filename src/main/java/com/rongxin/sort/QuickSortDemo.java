package com.rongxin.sort;

import java.util.Arrays;

/**
 * @ClassName QuickSortDemo
 * @Author RX_Zhao
 * @Date 16:07
 **/
public class QuickSortDemo {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 6, 5, 7, 8, 1, 0, 9};

        QuickSortDemo quickSortDemo = new QuickSortDemo();
        quickSortDemo.quickSort(arr, 0, arr.length - 1);
        System.out.printf(Arrays.toString(arr));
    }

    private void quickSort(int[] arr, int left, int right) {
        int begin = left;
        int end = right;
        int mid = begin + (end - begin) / 2;
        int value = arr[mid];
        while (begin < end) {
            if (arr[begin] < value) {
                begin++;
            }
            if (arr[end] > value) {
                end--;
            }
            if (arr[begin] >= value && arr[end] <= value) {
                int temp = arr[begin];
                arr[begin] = arr[end];
                arr[end] = temp;
                begin++;
                end--;
            }
        }
        if (end > left) {
            quickSort(arr, left, end);
        }
        if (begin < right) {
            quickSort(arr, begin, right);
        }
    }
}
