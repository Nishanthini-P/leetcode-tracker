// Last updated: 7/28/2026, 3:57:08 PM
1class Solution {
2    public int numIslands(char[][] grid) {
3        int count = 0;
4
5        for (int i = 0; i < grid.length; i++) {
6            for (int j = 0; j < grid[0].length; j++) {
7                if (grid[i][j] == '1') {
8                    count++;
9                    dfs(grid, i, j);
10                }
11            }
12        }
13
14        return count;
15    }
16
17    private void dfs(char[][] grid, int i, int j) {
18        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') {
19            return;
20        }
21
22        grid[i][j] = '0';
23
24        dfs(grid, i + 1, j);
25        dfs(grid, i - 1, j);
26        dfs(grid, i, j + 1);
27        dfs(grid, i, j - 1);
28    }
29}