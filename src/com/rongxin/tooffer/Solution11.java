package com.rongxin.tooffer;


/**
 * 输入一个整数，输出该数32位二进制表示中1的个数。其中负数用补码表示。
 */
public class Solution11 {
    public int NumberOf1(int n) {
        int num = 0;
        while(n != 0) {
            num += n & 1;
            n >>>= 1;
        }
        return  num;
    }
}
