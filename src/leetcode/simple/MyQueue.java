package leetcode.simple;

import java.util.Stack;

class MyQueue {

    private Stack<Integer> stack1;

    private Stack<Integer> stack2;

    private static Integer size = 0;

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.push(null);
        queue.push(null);
        System.out.println(queue.empty());

        /*queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.empty());
        queue.pop();
        queue.peek();
        System.out.println(1);*/
    }

    public Stack<Integer> handle(Stack<Integer> stack) {
        while (stack.size() != 0) {
            stack2.push(stack.pop());
        }
        return stack2;
    }

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(Integer x) {
        if (x != null) {
            stack1.push(x);
            size++;
        }
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        Stack<Integer> afterHandleStack = handle(stack1);
        size--;
        return afterHandleStack.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        Stack<Integer> afterHandleStack = handle(stack1);
        return afterHandleStack.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return size == 0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */