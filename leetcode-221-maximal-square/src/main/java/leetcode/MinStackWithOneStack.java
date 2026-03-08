package leetcode;

import java.util.Stack;

class MinStackWithOneStack {

    private int min = Integer.MAX_VALUE;
    private final Stack<Integer> stack;

    MinStackWithOneStack() {
        this.stack = new Stack<>();
    }

    public void push(int x) {
        if (x <= min) {
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }

    public void pop() {
        if (stack.pop() == min) min = stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}
