// Last updated: 7/27/2026, 3:09:14 PM
1class Solution {
2    public boolean isSameTree(TreeNode p, TreeNode q) {
3
4        // Both nodes are null
5        if (p == null && q == null)
6            return true;
7
8        // One node is null
9        if (p == null || q == null)
10            return false;
11
12        // Values are different
13        if (p.val != q.val)
14            return false;
15
16        // Check left and right subtrees
17        return isSameTree(p.left, q.left) &&
18               isSameTree(p.right, q.right);
19    }
20}