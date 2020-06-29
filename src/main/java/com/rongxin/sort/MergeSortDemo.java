package com.rongxin.sort;

import java.util.Arrays;

/**
 * 归并排序
 */
public class MergeSortDemo {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, 5, 0, 9, 6, 8, 7};
        new MergeSortDemo().mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    private void mergeSort(int[] arr, int left, int right) {
        int mid = left + (right - left) / 2;
        if (left < right) {
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right, new int[right - left + 1]);
        }

    }

    private void merge(int[] arr, int left, int mid, int right, int[] temp) {
        int t = 0;
        int l = left;
        int r = mid + 1;
        while (l <= mid && r <= right) {
            if (arr[l] <= arr[r]) {
                temp[t++] = arr[l++];
            } else {
                temp[t++] = arr[r++];
            }
        }
        while (l <= mid) {
            temp[t++] = arr[l++];
        }
        while (r <= right) {
            temp[t++] = arr[r++];
        }
        t = 0;
        while (left <= right) {
            arr[left++] = temp[t++];
        }
    }
}
