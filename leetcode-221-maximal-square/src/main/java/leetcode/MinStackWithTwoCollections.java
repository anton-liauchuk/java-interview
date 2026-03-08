package leetcode;

import java.util.Stack;
import java.util.TreeSet;

class MinStackWithTwoCollections {

    private final Stack<Integer> stack;
    private final TreeSet<Integer> treeSet;

    public MinStackWithTwoCollections() {
        this.stack = new Stack<>();
        this.treeSet = new TreeSet<>();
    }

    public void push(int val) {
        stack.push(val);
        treeSet.add(val);
    }

    public void pop() {
        Integer removed = stack.pop();
        treeSet.remove(removed);
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return treeSet.first();
    }
}
