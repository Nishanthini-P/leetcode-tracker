// Last updated: 7/27/2026, 3:02:34 PM
1class Solution {
2    public ListNode deleteDuplicates(ListNode head) {
3
4        ListNode current = head;
5
6        while (current != null && current.next != null) {
7
8            if (current.val == current.next.val) {
9                current.next = current.next.next;
10            } else {
11                current = current.next;
12            }
13        }
14
15        return head;
16    }
17}