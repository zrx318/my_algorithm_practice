package com.rongxin.tooffer;

/**
 * @ClassName _Solution57
 * @Author RX_Zhao
 * <p>
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
 * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 **/
public class _Solution57 {
    public TreeLinkNode GetNext(TreeLinkNode node) {
        if (node == null) {
            return null;
        }

        //先判断右节点
        if (node.right != null) {
            node = node.right;
            while (node.left != null) {
                node = node.left;
            }
            return node;
        }

        //右节点没值，判断父节点的左右节点？
        if (node.next != null && node == node.next.right) { //右儿子
            node = node.next;
            while (node != null && node.next != null && node.next.right == node) {
                node = node.next;
            }
        }

        if (node.next != null){
            return node.next;
        }
        return null;
    }
}
