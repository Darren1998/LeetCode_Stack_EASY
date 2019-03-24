package com.solutions;

import java.util.Stack;

/**
 * @author ：Darren
 * @date ：2019-03-24 12:35
 * @description： LeetCode #232 用栈实现队列
 * url: https://leetcode-cn.com/problems/implement-queue-using-stacks/
 */

/**
 * 使用栈实现队列的下列操作：
 *
 * push(x) -- 将一个元素放入队列的尾部。
 * pop() -- 从队列首部移除元素。
 * peek() -- 返回队列首部的元素。
 * empty() -- 返回队列是否为空。
 */

public class Solution_232 {


    public Stack<Integer> stackPush;
    public Stack<Integer> stackPop;

    /** Initialize your data structure here. */
    public Solution_232() {
        this.stackPush = new Stack<>();
        this.stackPop = new Stack<>();
    }

    public void pushToPop() {
        if (stackPop.isEmpty()) {
            while (!stackPush.isEmpty())
                stackPop.push(stackPush.pop());
        }
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stackPush.push(x);
        pushToPop();
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (stackPop.isEmpty() && stackPush.isEmpty()) {
            throw new RuntimeException("Queue is empty.");
        }
        pushToPop();
        return stackPop.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (stackPop.isEmpty() && stackPush.isEmpty()) {
            throw new RuntimeException("Queue is empty.");
        }
        pushToPop();
        return stackPop.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stackPush.isEmpty() && stackPop.isEmpty();
    }

}
