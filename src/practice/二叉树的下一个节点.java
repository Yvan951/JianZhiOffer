package practice;

/**
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
 * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 */
public class 二叉树的下一个节点 {
    class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }

    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null) {
            return null;
        }
        if (pNode.right != null) {
            TreeLinkNode right = pNode.right;
            while (right.left != null) {
                right = right.left;
            }
            return right;
        } else {
            if(pNode.next==null){
                return null;
            }
            if (pNode.next.left == pNode) {
                return pNode.next;
            } else {
                while (pNode.next.left != pNode) {
                    pNode = pNode.next;
                    if (pNode.next == null) {
                        return null;
                    }
                }
                return pNode.next;
            }
        }
    }
}
