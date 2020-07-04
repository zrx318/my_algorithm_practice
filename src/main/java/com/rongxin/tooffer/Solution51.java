package com.rongxin.tooffer;

/**
 * @ClassName Solution51
 * @Author RX_Zhao
 * @Date 15:33
 * @Version 给定一个数组A[0, 1, ..., n-1],
 * 请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
 * 不能使用除法。（注意：规定B[0] = A[1] * A[2] * ... * A[n-1]，B[n-1] = A[0] * A[1] * ... * A[n-2];）
 * <p>
 * 解：
 * B1[0] = 1
 * B1[1] = A[0]
 * B1[2] = A[0] * A[1]
 * ...
 * B1[n-1] = A[0] * A[1] * ... * A[n -2];
 * <p>
 * B2[0] = 1
 * B2[1] = A[n-1]
 * ...
 * B2[n-1] = A[n-1] * A[n-2] * ... * A[1]
 **/
public class Solution51 {
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        int[] B1 = new int[A.length]; //从左到右
        int[] B2 = new int[A.length]; //从右到左

        for (int i = 0; i < A.length; i++) {
            if (i == 0) {
                B1[0] = 1;
                B2[0] = 1;
                continue;
            }
            B1[i] = B1[i - 1] * A[i - 1];
            B2[i] = B2[i - 1] * A[A.length - i];
        }
        for (int i = 0; i < A.length; i++) {
            B[i] = B1[i] * B2[A.length - i - 1];
        }

        return B;
    }
}
