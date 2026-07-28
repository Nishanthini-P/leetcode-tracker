// Last updated: 7/28/2026, 3:56:35 PM
1import java.util.*;
2
3class Solution {
4    public List<Integer> rightSideView(TreeNode root) {
5        List<Integer> result = new ArrayList<>();
6
7        if (root == null) {
8            return result;
9        }
10
11        Queue<TreeNode> queue = new LinkedList<>();
12        queue.offer(root);
13
14        while (!queue.isEmpty()) {
15            int size = queue.size();
16
17            for (int i = 0; i < size; i++) {
18                TreeNode node = queue.poll();
19
20                if (i == size - 1) {
21                    result.add(node.val);
22                }
23
24                if (node.left != null) {
25                    queue.offer(node.left);
26                }
27
28                if (node.right != null) {
29                    queue.offer(node.right);
30                }
31            }
32        }
33
34        return result;
35    }
36}
37