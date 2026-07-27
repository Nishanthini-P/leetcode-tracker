// Last updated: 7/27/2026, 3:10:09 PM
1class Solution {
2
3    public boolean isSymmetric(TreeNode root) {
4        if (root == null)
5            return true;
6
7        return isMirror(root.left, root.right);
8    }
9
10    private boolean isMirror(TreeNode left, TreeNode right) {
11
12        if (left == null && right == null)
13            return true;
14
15        if (left == null || right == null)
16            return false;
17
18        if (left.val != right.val)
19            return false;
20
21        return isMirror(left.left, right.right) &&
22               isMirror(left.right, right.left);
23    }
24}