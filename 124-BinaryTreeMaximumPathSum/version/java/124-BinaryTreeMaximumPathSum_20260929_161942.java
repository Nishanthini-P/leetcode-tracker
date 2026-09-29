// Last updated: 9/29/2026, 4:19:42 PM
1class Solution {
2
3    int maxSum = Integer.MIN_VALUE;
4
5    public int maxPathSum(TreeNode root) {
6        findMax(root);
7        return maxSum;
8    }
9
10    public int findMax(TreeNode node) {
11
12        if (node == null) {
13            return 0;
14        }
15
16        int left = Math.max(0, findMax(node.left));
17        int right = Math.max(0, findMax(node.right));
18
19        int currentPath = left + node.val + right;
20
21        maxSum = Math.max(maxSum, currentPath);
22
23        return node.val + Math.max(left, right);
24    }
25}