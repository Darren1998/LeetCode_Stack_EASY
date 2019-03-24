import java.util.*;


public class LeetCode_stack_easy {

    public static void main(String[] args) {

    }

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

/***************    LeetCode #20 Begin   ***************/
    /*private HashMap<Character, Character> mappings;

    public LeetCode_stack_easy() {
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')','(');
        this.mappings.put('}','{');
        this.mappings.put(']','[');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (this.mappings.containsKey(c)) {
                char topElement = stack.empty() ? '#' : stack.pop();
                if (topElement != this.mappings.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }*/
/***************    LeetCode #20 End   ***************/

/***************    LeetCode #155 Begin   ***************/
/*class MinStack {

    private Stack<Integer> stack;

    *//** initialize your data structure here. *//*
    public MinStack() {
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
}*/
/***************    LeetCode #155 End   ***************/

/***************    LeetCode #225 Begin   ***************/
//class MyStack {
//
//    Deque<Integer> deque;
//    /** Initialize your data structure here. */
//    public MyStack() {
//        deque = new LinkedList<>();
//    }
//
//    /** Push element x onto stack. */
//    public void push(int x) {
//        deque.addFirst(x);
//    }
//
//    /** Removes the element on top of the stack and returns that element. */
//    public int pop() {
//        return deque.pop();
//    }
//
//    /** Get the top element. */
//    public int top() {
//        return deque.peek();
//    }
//
//    /** Returns whether the stack is empty. */
//    public boolean empty() {
//        return deque.size() == 0 ? true : false;
//    }
//}
/***************    LeetCode #225 End   ***************/

/***************    LeetCode #232 Begin   ***************/
//class MyQueue {
//
//    public Stack<Integer> stackPush;
//    public Stack<Integer> stackPop;
//
//    /** Initialize your data structure here. */
//    public MyQueue() {
//        this.stackPush = new Stack<>();
//        this.stackPop = new Stack<>();
//    }
//
//    public void pushToPop() {
//        if (stackPop.isEmpty()) {
//            while (!stackPush.isEmpty())
//                stackPop.push(stackPush.pop());
//        }
//    }
//
//    /** Push element x to the back of queue. */
//    public void push(int x) {
//        stackPush.push(x);
//        pushToPop();
//    }
//
//    /** Removes the element from in front of queue and returns that element. */
//    public int pop() {
//        if (stackPop.isEmpty() && stackPush.isEmpty()) {
//            throw new RuntimeException("Queue is empty.");
//        }
//        pushToPop();
//        return stackPop.pop();
//    }
//
//    /** Get the front element. */
//    public int peek() {
//        if (stackPop.isEmpty() && stackPush.isEmpty()) {
//            throw new RuntimeException("Queue is empty.");
//        }
//        pushToPop();
//        return stackPop.peek();
//    }
//
//    /** Returns whether the queue is empty. */
//    public boolean empty() {
//        return stackPush.isEmpty() && stackPop.isEmpty();
//    }
//}
/***************    LeetCode #232 End   ***************/

/***************    LeetCode #496 Begin   ***************/
/*class Solution {
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
}*/
/***************    LeetCode #496 End   ***************/


/***************    LeetCode #682 Begin   ***************/
//class Solution {
//    public int calPoints(String[] ops) {
//        Stack<Integer> stack = new Stack<>();
//        int result = 0;
//        for (int i = 0; i < ops.length; i++) {
//            if (ops[i].equals("+")) {
//                stack.push(stack.get(stack.size() - 1) + stack.get(stack.size() - 2));
//                continue;
//            }
//            if (ops[i].equals("D")) {
//                stack.push(stack.get(stack.size() - 1) * 2);
//                continue;
//            }
//            if (ops[i].equals("C")) {
//                stack.pop();
//                continue;
//            }
//            stack.push(Integer.parseInt(ops[i]));
//        }
//        while (!stack.isEmpty()){
//            result += stack.pop();
//        }
//        return result;
//    }
//}
/***************    LeetCode #682 End   ***************/

/***************    39 Step Problem Begin   ***************/
    /*private static int solution(int remainStep, int prevStep) {
        if (remainStep == 1) {
            if (prevStep % 2 == 0)
                return 0;
            return 1;
        }
        if (remainStep == 2)
            return 1;
        return solution(remainStep - 1, prevStep + 1) + solution(remainStep - 2, prevStep + 1);
    }*/
/***************    39 Step Problem End   ***************/
}
