// Last updated: 7/27/2026, 3:14:56 PM
1class Solution {
2    public void flatten(TreeNode root) {
3
4        if (root == null)
5            return;
6
7        // Flatten left and right subtrees
8        flatten(root.left);
9        flatten(root.right);
10
11        // Save the original right subtree
12        TreeNode temp = root.right;
13
14        // Move left subtree to the right
15        root.right = root.left;
16        root.left = null;
17
18        // Find the end of the new right subtree
19        TreeNode current = root;
20        while (current.right != null) {
21            current = current.right;
22        }
23
24        // Attach the original right subtree
25        current.right = temp;
26    }
27}