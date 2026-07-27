// Last updated: 7/27/2026, 3:04:49 PM
1class Solution {
2
3    public List<Integer> inorderTraversal(TreeNode root) {
4        List<Integer> result = new ArrayList<>();
5        inorder(root, result);
6        return result;
7    }
8
9    private void inorder(TreeNode node, List<Integer> result) {
10
11        if (node == null)
12            return;
13
14        inorder(node.left, result);
15        result.add(node.val);
16        inorder(node.right, result);
17    }
18}