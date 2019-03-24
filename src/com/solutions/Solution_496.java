package com.solutions;

/**
 * @author : Darren
 * @date : 2019-03-24 12:39
 * @description: LeetCode #496 下一个更大元素 I
 * url: https://leetcode-cn.com/problems/next-greater-element-i/
 */

import java.util.HashMap;
import java.util.Stack;

/**
 * 给定两个没有重复元素的数组 nums1 和 nums2 ，其中nums1 是 nums2 的子集。
 * 找到 nums1 中每个元素在 nums2 中的下一个比其大的值。
 *
 * nums1 中数字 x 的下一个更大元素是指 x 在 nums2 中对应位置的右边的第一个比 x 大的元素。
 * 如果不存在，对应位置输出-1。
 */

public class Solution_496 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int[] result = new int[nums1.length];

        for (int i = 0; i < nums2.length; i++) {
            while (!stack.isEmpty() && nums2[i] > stack.peek()) {
                hashMap.put(stack.pop(), nums2[i]);
            }
            stack.push(nums2[i]);
        }

        for (int i = 0; i < nums1.length; i++) {
            result[i] = hashMap.getOrDefault(nums1[i], -1);
        }
        return result;
    }

}
