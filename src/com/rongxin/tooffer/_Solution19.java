package com.rongxin.tooffer;


import java.util.ArrayList;

/**
 * 输入一个矩阵，
 * 按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵：
 * 1  2  3  4
 * 5  6  7  8
 * 9  10 11 12
 * 13 14 15 16 则依次打印出数字
 *
 * 1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class _Solution19 {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();

        if (matrix == null || matrix.length == 0) return  list;

        int R = matrix.length;
        int C = matrix[0].length;

        int r = 0, c = 0, di = 0;
        boolean[][] rec = new boolean[R][C];
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};

        for (int i = 0; i < R * C; i++) {
            list.add(matrix[r][c]);
            rec[r][c] = true;

            int rr = r + dr[di];
            int cc = c + dc[di];
            if (rr >= 0 && rr < R && cc >=0 && cc < C && rec[rr][cc] == false) {
                r = rr;
                c = cc;
            } else {
                di = (di + 1) % 4;
                r = r + dr[di];
                c = c + dc[di];
            }
        }
        return list;
    }
}
