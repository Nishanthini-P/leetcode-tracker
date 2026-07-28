// Last updated: 7/28/2026, 3:17:03 PM
1public class Solution {
2    public boolean hasCycle(ListNode head) {
3        ListNode slow = head;
4        ListNode fast = head;
5
6        while (fast != null && fast.next != null) {
7            slow = slow.next;
8            fast = fast.next.next;
9
10            if (slow == fast) {
11                return true;
12            }
13        }
14
15        return false;
16    }
17}
18