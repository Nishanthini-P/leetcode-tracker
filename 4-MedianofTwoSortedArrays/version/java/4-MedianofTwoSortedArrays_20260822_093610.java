// Last updated: 8/22/2026, 9:36:10 AM
1class Solution {
2    public ListNode mergeKLists(ListNode[] lists) {
3
4        PriorityQueue<ListNode> pq =
5            new PriorityQueue<>((a, b) -> a.val - b.val);
6
7        // Add first node of every list
8        for (ListNode node : lists) {
9            if (node != null) {
10                pq.add(node);
11            }
12        }
13
14        ListNode dummy = new ListNode(0);
15        ListNode current = dummy;
16
17        while (!pq.isEmpty()) {
18
19            // Get smallest node
20            ListNode node = pq.poll();
21
22            // Add it to result
23            current.next = node;
24            current = current.next;
25
26            // Add next node from the same list
27            if (node.next != null) {
28                pq.add(node.next);
29            }
30        }
31
32        return dummy.next;
33    }
34}