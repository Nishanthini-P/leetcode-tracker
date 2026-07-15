// Last updated: 7/15/2026, 9:27:09 AM
1class Solution {
2    public ListNode removeNthFromEnd(ListNode head, int n) {
3
4        ListNode dummy = new ListNode(0);
5        dummy.next = head;
6
7        ListNode fast = dummy;
8        ListNode slow = dummy;
9        for (int i = 0; i <= n; i++) {
10            fast = fast.next;
11        }
12
13        while (fast != null) {
14            fast = fast.next;
15            slow = slow.next;
16        }
17
18        slow.next = slow.next.next;
19
20        return dummy.next;
21    }
22}