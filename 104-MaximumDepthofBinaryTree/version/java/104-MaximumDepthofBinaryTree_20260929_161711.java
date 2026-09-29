// Last updated: 9/29/2026, 4:17:11 PM
1class Solution {
2    public int maxDepth(TreeNode root) {
3
4        if (root == null) {
5            return 0;
6        }
7
8        int left = maxDepth(root.left);
9        int right = maxDepth(root.right);
10
11        return 1 + Math.max(left, right);
12    }
13}