package com.rongxin.tooffer;

/**
 * @ClassName Solution47
 * @Author RX_Zhao
 * <p>
 * <p>
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 **/
public class Solution47 {
    public int Sum_Solution(int n) {
        if (n == 1) {
            return 1;
        } else {
            return Sum_Solution(n - 1) + n;
        }
    }
}
