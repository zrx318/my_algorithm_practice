package com.rongxin.tooffer;

/**
 * @ClassName Solution44
 * @Author RX_Zhao
 * @Date 13:55
 * @Version
 **/

/**
 * 牛客最近来了一个新员工Fish，
 * 每天早晨总是会拿着一本英文杂志，
 * 写些句子在本子上。同事Cat对Fish写的内容颇感兴趣，
 * 有一天他向Fish借来翻看，但却读不懂它的意思。
 * 例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，正
 * 确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
 */
public class Solution44 {
    public String ReverseSentence(String str) {
        char[] charStr = str.toCharArray();
        for (int i = 0; i < charStr.length / 2; i++) {
            char temp = charStr[i];
            charStr[i] = charStr[charStr.length - 1 - i];
            charStr[charStr.length - i - 1] = temp;
        }

        int start = 0;
        int end;
        for (int i = 0; i < charStr.length; i++) {
            if (charStr[i] == ' ' || i == charStr.length - 1) {
                if (charStr[i] == ' ') {
                    end = i;
                } else {
                    end = i + 1;
                }
                for (int j = start; j < (end + start) / 2; j++) {
                    char temp = charStr[j];
                    charStr[j] = charStr[end - 1 + start - j];
                    charStr[end - 1 + start - j] = temp;
                }
                start = end + 1;
            }
        }
        return String.valueOf(charStr);
    }
}
