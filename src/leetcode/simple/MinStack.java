package leetcode.simple;

import java.util.Stack;

public class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> stackForMin;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new Stack<>();
        stackForMin = new Stack<>();
    }

    public void push(int x) {
        if (stackForMin.isEmpty()) {
            stackForMin.push(x);
        } else {
            stackForMin.push(Math.min(stackForMin.peek(), x));
        }
        stack.push(x);
    }

    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
            stackForMin.pop();
        }
    }

    public int top() {
        if (!stack.isEmpty()) {
            return stack.peek();
        }
        return -1;
    }

    public int getMin() {
        return stackForMin.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(0);
        minStack.push(1);
        minStack.push(0);
        System.out.println(minStack.getMin());   // 返回 -3.
        minStack.pop();
        minStack.top();      // 返回 0.
        System.out.println(minStack.getMin());  // 返回 -2.
    }
}
