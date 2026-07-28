// Last updated: 7/28/2026, 3:02:27 PM
1class Solution {
2    public boolean isBalanced(TreeNode root) {
3        return height(root) != -1;
4    }
5
6    private int height(TreeNode node) {
7        if (node == null) {
8            return 0;
9        }
10
11        int left = height(node.left);
12        if (left == -1) {
13            return -1;
14        }
15
16        int right = height(node.right);
17        if (right == -1) {
18            return -1;
19        }
20
21        if (Math.abs(left - right) > 1) {
22            return -1;
23        }
24
25        return Math.max(left, right) + 1;
26    }
27}