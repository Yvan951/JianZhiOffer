package practice;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList
 */
public class 从尾到头打印链表 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        /**
         * 方法一：使用显式栈的输出，不使用递归
         */
        /*{
            if (listNode == null) {
                return new ArrayList<>();
            }
            Stack<Integer> stack = new Stack<>();
            ListNode curNode = listNode;
            while (curNode != null) {
                stack.push(curNode.val);
                curNode = curNode.next;
            }
            ArrayList<Integer> result = new ArrayList<>();
            while (!stack.isEmpty()) {
                result.add(stack.pop());
            }
            return result;
        }*/

        /**
         * 方法二：递归解法，隐式使用系统栈
         */
        {
            if (listNode == null) {
                return new ArrayList<>();
            }
            ArrayList<Integer> result=new ArrayList<>();
            result.add(helper(result,listNode));
            return result;
        }
    }

    private int helper(ArrayList result, ListNode curNode){
        if(curNode.next!=null){
            result.add(helper(result,curNode.next));
            return curNode.val;
        }else if(curNode.next==null){
            return curNode.val;
        }
        return 0;
    }
}
