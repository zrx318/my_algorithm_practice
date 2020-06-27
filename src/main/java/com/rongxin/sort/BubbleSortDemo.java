package com.rongxin.sort;

import java.util.Arrays;

/**
 **/
public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] arr = {3,2,4,6,5,7,8,1,0,9};
        BubbleSortDemo bubbleSortDemo = new BubbleSortDemo();
        bubbleSortDemo.bubbleSort(arr);
        System.out.printf(Arrays.toString(arr));
    }

    private void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                boolean flag = false;
                if (arr[i] < arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                    flag = true;
                }
                if (!flag) {
                    break;
                }
            }
        }
    }

}
