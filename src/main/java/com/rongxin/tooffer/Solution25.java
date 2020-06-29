package main.java.com.rongxin.tooffer;

/**
 * @ClassName Solution25
 * @Author RX_Zhao
 * @Date 14:51
 * <p>
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，
 * 一个指向下一个节点，另一个特殊指针random指向一个随机节点），
 * 请对此链表进行深拷贝，并返回拷贝后的头结点。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 **/
public class Solution25 {
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) {
            return pHead;
        }
        RandomListNode newHead = pHead;
        // 复制节点
        while (newHead != null) {
            RandomListNode next = new RandomListNode(newHead.label);
            next.next = newHead.next;
            newHead.next = next;
            newHead = next.next;
        }
        // randon引用
        newHead = pHead;
        while (newHead != null) {
            if (newHead.random != null) {
                newHead.next.random = newHead.random.next;
            }
            newHead = newHead.next.next;
        }

        // 拆分链表
        RandomListNode res = pHead.next;
        newHead = pHead;
        while (newHead != null) {
            RandomListNode cur = newHead.next;
            newHead.next = cur.next;
            if (newHead.next != null) {
                cur.next = cur.next.next;
            }
            newHead = newHead.next;
        }

        return res;
    }
    class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

}
