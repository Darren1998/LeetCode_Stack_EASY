package com.solutions;

/**
 * @author : Darren
 * @date : 2019-03-24 13:10
 * @description:
 */
public class Solution_1_2_3_5 {

    /***************    LeetCode #1 Begin   ***************/
    /*public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (hm.containsKey(complement) && hm.get(complement) != i) {
                return new int[]{i, hm.get(complement)};
            }
        }
        throw new IllegalArgumentException("No solution.");
    }*/
/***************    LeetCode #1 End   ***************/

/***************    LeetCode #2 Begin   ***************/

    /*public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }*/

    /*public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyNode;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null)
                p = p.next;
            if (q != null)
                q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyNode.next;
    }*/

/***************    LeetCode #2 End   ***************/

/***************    LeetCode #3 Begin   ***************/
    /*
    public static int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, ans = 0;
        Map<Character, Integer> hm = new HashMap<>();
        for (j = 0, i = 0; j < s.length(); j++) {
            if (hm.containsKey(s.charAt(j))) {
                i = Math.max(hm.get(s.charAt(j)),i);
            }
            ans = Math.max(ans, j - i + 1);
            hm.put(s.charAt(j), j + 1);
        }
        return ans;
    }*/
/***************    LeetCode #3 End   ***************/

/***************    LeetCode #5 Begin   ***************/
    /*public static int longestPa(String s) {
        if (s == null || s.length() < 1) return 0;
        int start = 0, end = 0, max = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i); //奇数情况
            int len2 = expandAroundCenter(s, i, i + 1); //偶数情况
            int len = Math.max(len1, len2); //判断奇偶谁符合
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return max;
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }*/
/***************    LeetCode #5 End   ***************/

}
