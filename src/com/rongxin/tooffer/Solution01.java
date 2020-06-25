package com.rongxin.tooffer;

/**
 * 在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 *
 * eg:
 * 1 2 3 4 5
 * 2 4 5 6 8
 * 3 5 7 8 9
 *
 *
 */
public class Solution01 {
    public boolean Find(int target, int [][] array) {
        if (array == null || array.length ==0) {
            return false;
        }

        //行
        int rows = array.length;
        //列
        int cols = array[0].length;
        int row = 0;
        int col = cols -1;
        while(row <= rows - 1 && col >=0) {
            if (target == array[row][col]) {
                return true;
            }else {
                if (target > array[row][col]) {
                    row ++;
                } else {
                    col --;
                }
            }
        }
        return false;
    }
}
