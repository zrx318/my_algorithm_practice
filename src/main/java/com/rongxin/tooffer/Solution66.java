package com.rongxin.tooffer;

/**
 * 题目描述
 * 地上有一个m行和n列的方格。
 * 一个机器人从坐标0,0的格子开始移动，
 * 每一次只能向左，右，上，下四个方向移动一格，
 * 但是不能进入行坐标和列坐标的数位之和大于k的格子。
 * 例如，当k为18时，机器人能够进入方格（35,37），
 * 因为3+5+3+7 = 18。但是，它不能进入方格（35,38），
 * 因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
 */
public class Solution66 {
    public int movingCount(int threshold, int rows, int cols) {
        return dfs(threshold, 0, 0, rows, cols, new boolean[rows][cols]);
    }

    private int dfs(int threshold, int row, int col, int rows, int cols, boolean[][] flag) {
        int tNum = 0;
        int r = row;
        int c = col;
        while (r != 0 || c != 0) {
            tNum = tNum + r % 10 + c % 10;
            r /= 10;
            c /= 10;
        }
        if (row >= 0 && row < rows && col >= 0 && col < cols && flag[row][col] == false && tNum <= threshold) {
            flag[row][col] = true;
            return 1 + dfs(threshold, row - 1, col, rows, cols, flag)
                    + dfs(threshold, row + 1, col, rows, cols, flag)
                    + dfs(threshold, row, col - 1, rows, cols, flag)
                    + dfs(threshold, row, col + 1, rows, cols, flag);
        }
        return 0;
    }
}
