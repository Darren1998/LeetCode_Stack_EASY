package com.solutions; /**
 * @author ：Darren
 * @date ：Created in 2019-03-24 12:29
 * @description： LeetCode #225 用队列实现栈
 */

import java.util.Deque;
import java.util.LinkedList;

/**
 * 使用队列实现栈的下列操作：
 *
 * push(x) -- 元素 x 入栈
 * pop() -- 移除栈顶元素
 * top() -- 获取栈顶元素
 * empty() -- 返回栈是否为空
 *
 */

public class Solution_225 {

    Deque<Integer> deque;
    /** Initialize your data structure here. */
    public Solution_225() {
        deque = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        deque.addFirst(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return deque.pop();
    }

    /** Get the top element. */
    public int top() {
        return deque.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return deque.size() == 0 ? true : false;
    }

}
