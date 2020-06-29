package com.rongxin.tooffer;

/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
 * 打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，
 * 则打印出这三个数字能排成的最小数字为321323。
 */
public class Solution32 {

    String min;

    public String PrintMinNumber(int[] numbers) {
        dfs(numbers, 0, new StringBuffer(), new boolean[numbers.length]);
        return min;
    }

    private void dfs(int[] num, int index, StringBuffer sb, boolean[] flag) {
        if (index == num.length) {
            min = getMin(min, sb.toString());
            return;
        }
        for (int i = 0; i < num.length; i++) {
            if (!flag[i]) {
                flag[i] = true;
                sb.append(num[i]);
                dfs(num, index + 1, new StringBuffer(sb), flag);
                flag[i] = false;
                sb.delete(sb.length() - String.valueOf(num[i]).length(), sb.length());
            }
        }
    }

    private static String getMin(String min, String str) {
        if (min == null) {
            return str;
        }
        if (min.length() < str.length()) {
            return min;
        } else if (min.length() > str.length()) {
            return str;
        } else {
            for (int i = 0; i < min.length(); i++) {
                if (min.charAt(i) < str.charAt(i)) {
                    return min;
                } else if (min.charAt(i) > str.charAt(i)) {
                    return str;
                } else {
                    continue;
                }
            }
        }
        return min;
    }
}
