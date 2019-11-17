package practice;

import java.util.Stack;

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class 两个栈实现队列 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
        else {
            return stack2.pop();
        }
    }

    public static void main(String[] args) {
        两个栈实现队列 test = new 两个栈实现队列();
        test.push(1);
        test.push(2);
        test.push(3);
        test.pop();
        test.pop();
        test.push(4);
        test.pop();
        test.push(5);
        test.pop();
        test.pop();

    }
}
