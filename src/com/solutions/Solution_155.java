package com.solutions; /**
 * @author ：Darren
 * @date ：Created in 2019-03-24 12:15
 * @description：LeetCode #155 最小栈
 */

import java.util.Stack;

/**
 * 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 * push(x) -- 将元素 x 推入栈中。
 * pop() -- 删除栈顶的元素。
 * top() -- 获取栈顶元素。
 * getMin() -- 检索栈中的最小元素。
 *
 */

public class Solution_155 {

    private Stack<Integer> stack;

    /** initialize your data structure here. */
    public Solution_155() {
        stack = new Stack<>();
    }

    public void push(int x) {
        if (stack.isEmpty()) {
            stack.push(x);
            stack.push(x);
        } else {
            int currMin = stack.peek();
            stack.push(x);
            if (currMin > x) {
                stack.push(x);
            } else {
                stack.push(currMin);
            }
        }

    }

    public void pop() {
        stack.pop();
        stack.pop();
    }

    public int top() {
        return stack.get(stack.size() - 2);
    }

    public int getMin() {
        return stack.peek();
    }

}
