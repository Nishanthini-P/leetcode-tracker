// Last updated: 7/27/2026, 3:11:57 PM
1class Solution {
2    public boolean hasPathSum(TreeNode root, int targetSum) {
3
4        if (root == null)
5            return false;
6
7        // If it's a leaf node
8        if (root.left == null && root.right == null)
9            return targetSum == root.val;
10
11        return hasPathSum(root.left, targetSum - root.val) ||
12               hasPathSum(root.right, targetSum - root.val);
13    }
14}
15