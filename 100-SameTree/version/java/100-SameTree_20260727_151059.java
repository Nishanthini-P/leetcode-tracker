// Last updated: 7/27/2026, 3:10:59 PM
1class Solution {
2    public int minDepth(TreeNode root) {
3
4        if (root == null)
5            return 0;
6
7        // If left subtree is empty
8        if (root.left == null)
9            return 1 + minDepth(root.right);
10
11        // If right subtree is empty
12        if (root.right == null)
13            return 1 + minDepth(root.left);
14
15        // Both subtrees exist
16        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
17    }
18}