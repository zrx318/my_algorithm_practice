package com.rongxin.tooffer;

import java.util.ArrayList;

/**
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,
 * 则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 */
public class _Solution27 {
    public static void main(String[] args) {
        String str = "aa";
        _Solution27 solution27 = new _Solution27();
        ArrayList<String> permutation = solution27.Permutation(str);
        System.out.println(permutation.toString());
    }

    ArrayList<String> res = new ArrayList<>();

    public ArrayList<String> Permutation(String str) {
        if (str == null || str.length() <= 0) {
            return res;
        }
        dfs(str, new StringBuffer(), 0, new boolean[str.length()]);
        return res;
    }

    private void dfs(String str, StringBuffer sb, int index, boolean[] flag) {
        if (index == str.length() && !res.contains(sb.toString())) {
            res.add(sb.toString());
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            if (!flag[i]) {
                flag[i] = true;
                sb.append(str.charAt(i));
                dfs(str, sb, index + 1, flag);
                flag[i] = false;
                sb.deleteCharAt(sb.length() - 1);
            }
        }


    }
}
