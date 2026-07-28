// Last updated: 7/28/2026, 3:58:50 PM
1class Solution {
2    public ListNode removeElements(ListNode head, int val) {
3        ListNode dummy = new ListNode(0);
4        dummy.next = head;
5
6        ListNode current = dummy;
7
8        while (current.next != null) {
9            if (current.next.val == val) {
10                current.next = current.next.next;
11            } else {
12                current = current.next;
13            }
14        }
15
16        return dummy.next;
17    }
18}