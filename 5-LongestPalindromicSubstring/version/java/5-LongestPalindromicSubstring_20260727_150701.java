// Last updated: 7/27/2026, 3:07:01 PM
1class Solution {
2
3    public TreeNode sortedArrayToBST(int[] nums) {
4        return buildTree(nums, 0, nums.length - 1);
5    }
6
7    private TreeNode buildTree(int[] nums, int left, int right) {
8
9        if (left > right)
10            return null;
11
12        int mid = left + (right - left) / 2;
13
14        TreeNode root = new TreeNode(nums[mid]);
15
16        root.left = buildTree(nums, left, mid - 1);
17        root.right = buildTree(nums, mid + 1, right);
18
19        return root;
20    }
21}
22