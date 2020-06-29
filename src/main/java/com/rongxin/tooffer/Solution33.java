package com.rongxin.tooffer;

/**
 * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。
 * 例如6、8都是丑数，但14不是，因为它包含质因子7。 习
 * 惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */
public class Solution33 {
    public int GetUglyNumber_Solution(int index) {
        int[] ugly = new int[index];
        ugly[0] = 1;
        int p2 = 0, p3 = 0, p5 = 0;
        for (int i = 1; i < ugly.length; i++) {
            ugly[i] = min(2 * ugly[p2], 3 * ugly[p3], 5 * ugly[p5]);
            if (ugly[i] == 2 * ugly[p2]) {
                p2++;
            }
            if (ugly[i] == 3 * ugly[p3]) {
                p3++;
            }
            if (ugly[i] == 5 * ugly[p5]) {
                p5++;
            }
        }
        return ugly[index - 1];
    }

    private int min(int i, int i1, int i2) {
        int min = i;
        min = min < i1 ? min : i1;
        min = min < i2 ? min : i2;
        return min;
    }
}
