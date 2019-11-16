package practice;

import java.util.Arrays;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
public class 重建二叉树 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        return helper(pre, in);
    }

    public TreeNode helper(int[] pre, int[] in) {
        if (pre.length != in.length || pre.length == 0 || in.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
        int indexIn = -1;
        for (int i = 0; i < in.length; i++) {
            if (in[i] == pre[0]) {
                indexIn = i;
            }
        }
        int[] leftIn = Arrays.copyOfRange(in, 0, indexIn);
        int[] rightIn = Arrays.copyOfRange(in, indexIn + 1, in.length);
        int[] leftPre = Arrays.copyOfRange(pre, 1, 1 + leftIn.length);
        int[] rightPre = Arrays.copyOfRange(pre, 1 + leftIn.length, pre.length);
        root.left = helper(leftPre, leftIn);
        root.right = helper(rightPre, rightIn);
        return root;
    }

    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        重建二叉树 test = new 重建二叉树();
        TreeNode result = test.reConstructBinaryTree(pre, in);
    }
}
