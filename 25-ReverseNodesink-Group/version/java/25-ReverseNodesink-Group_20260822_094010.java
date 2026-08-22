// Last updated: 8/22/2026, 9:40:10 AM
1class Solution {
2    public ListNode reverseKGroup(ListNode head, int k) {
3
4        ListNode dummy = new ListNode(0);
5        dummy.next = head;
6
7        ListNode prev = dummy;
8
9        while (true) {
10
11            // Find kth node
12            ListNode kth = prev;
13
14            for (int i = 0; i < k; i++) {
15                kth = kth.next;
16
17                if (kth == null) {
18                    return dummy.next;
19                }
20            }
21
22            ListNode nextGroup = kth.next;
23
24            // Reverse the group
25            ListNode curr = prev.next;
26            ListNode prevNode = nextGroup;
27
28            while (curr != nextGroup) {
29                ListNode next = curr.next;
30                curr.next = prevNode;
31                prevNode = curr;
32                curr = next;
33            }
34
35            // Connect the reversed group
36            ListNode temp = prev.next;
37            prev.next = kth;
38            prev = temp;
39        }
40    }
41}
42