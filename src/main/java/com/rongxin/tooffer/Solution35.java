package com.rongxin.tooffer;

/**
 * 题目描述
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，
 * 则这两个数字组成一个逆序对。输入一个数组,求出这个数组中的逆序对的总数P。
 * 并将P对1000000007取模的结果输出。 即输出P%1000000007
 * 输入描述:
 * 题目保证输入的数组中没有的相同的数字
 * <p>
 * 数据范围：
 * <p>
 * 对于%50的数据,size<=10^4
 * <p>
 * 对于%75的数据,size<=10^5
 * <p>
 * 对于%100的数据,size<=2*10^5
 */
public class Solution35 {
    int num;

    public int InversePairs(int[] array) {
        mergeSort(array);
        return num;
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
                num = num + mid - l + 1;
                num %= 1000000007;
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
