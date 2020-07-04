package com.rongxin.tooffer;

/**
 * 题目描述
 * 统计一个数字在排序数组中出现的次数。
 */
public class Solution37 {
    public static void main(String[] args) {
        int[] arr = {3, 3, 3, 3, 4, 5};
        int k = 3;
        Solution37 solution37 = new Solution37();
        int i = solution37.GetNumberOfK(arr, k);
        System.out.println(i);
    }

    public int GetNumberOfK(int[] array, int k) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int left = getIndex(array, true, k);
        int right = getIndex(array, false, k);
        if (left == -1 || right == -1) {
            return 0;
        }
        return right - left + 1;
    }

    private int getIndex(int[] array, boolean left, int k) {
        int begin = 0;
        int end = array.length - 1;
        int mid;
        while (begin <= end) {
            mid = begin + (end - begin) / 2;

            if (array[mid] < k) {
                begin = mid + 1;
            } else if (array[mid] > k) {
                end = mid - 1;
            } else {
                if (left) {
                    if (mid > begin && array[mid - 1] == k) {
                        end = mid - 1;
                    } else {
                        return mid;
                    }
                } else {
                    if (mid < end && array[mid + 1] == k) {
                        begin = mid + 1;
                    } else {
                        return mid;
                    }
                }
            }
        }
        return -1;
    }
}
