package practice;

import java.util.Stack;

public class 两个栈实现队列 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        if (stack1.empty()&&stack2.empty()){
            stack2.push(node);
            return;
        }
        if(stack1.empty()&&!stack2.empty()){
            while (!stack2.empty()){
                stack1.push(stack2.pop());
            }
            stack1.push(node);
            while (!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
    }

    public int pop() {
        return stack2.pop();
    }

    public static void main(String[] args) {
        两个栈实现队列 test=new 两个栈实现队列();
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
