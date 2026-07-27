// Last updated: 7/27/2026, 3:14:04 PM
1class Solution {
2
3    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
4
5        List<List<Integer>> result = new ArrayList<>();
6        List<Integer> path = new ArrayList<>();
7
8        dfs(root, targetSum, path, result);
9
10        return result;
11    }
12
13    private void dfs(TreeNode node, int targetSum,
14                     List<Integer> path,
15                     List<List<Integer>> result) {
16
17        if (node == null)
18            return;
19
20        // Add current node
21        path.add(node.val);
22
23        // If it is a leaf and sum matches
24        if (node.left == null && node.right == null
25                && targetSum == node.val) {
26
27            result.add(new ArrayList<>(path));
28        }
29
30        // Traverse left and right
31        dfs(node.left, targetSum - node.val, path, result);
32        dfs(node.right, targetSum - node.val, path, result);
33
34        // Backtrack
35        path.remove(path.size() - 1);
36    }
37}
38