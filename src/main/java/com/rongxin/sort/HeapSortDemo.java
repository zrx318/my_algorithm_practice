package com.rongxin.sort;

/**
 * @ClassName HeapSortDemo
 * @Author RX_Zhao
 * @Date 16:55
 * @Version
 **/
public class HeapSortDemo {
    private static void heapSort(int[] arr) {
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            adjustHeap(arr, i, arr.length);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            swap(arr, 0, i);
            adjustHeap(arr, 0, i);
        }
    }

    public static void adjustHeap(int[] arr, int i, int length) {
        int index = i;
        int left = index * 2 + 1;
        int right = index * 2 + 2;
        if (left < length && arr[index] < arr[left]) {
            index = left;
        }

        if (right < length && arr[index] < arr[right]) {
            index = right;
        }

        if (index != i) {
            swap(arr, index, i);
            adjustHeap(arr, index, length);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
