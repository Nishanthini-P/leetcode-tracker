// Last updated: 7/28/2026, 4:00:34 PM
1class Solution {
2    public ListNode reverseList(ListNode head) {
3        ListNode prev = null;
4        ListNode curr = head;
5
6        while (curr != null) {
7            ListNode next = curr.next;
8            curr.next = prev;
9            prev = curr;
10            curr = next;
11        }
12
13        return prev;
14    }
15}