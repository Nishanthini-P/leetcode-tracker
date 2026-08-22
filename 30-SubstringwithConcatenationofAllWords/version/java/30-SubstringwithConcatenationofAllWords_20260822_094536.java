// Last updated: 8/22/2026, 9:45:36 AM
1class Solution {
2
3    public void solveSudoku(char[][] board) {
4        solve(board);
5    }
6
7    public boolean solve(char[][] board) {
8
9        // Find an empty cell
10        for (int row = 0; row < 9; row++) {
11            for (int col = 0; col < 9; col++) {
12
13                if (board[row][col] == '.') {
14
15                    // Try numbers 1 to 9
16                    for (char num = '1'; num <= '9'; num++) {
17
18                        if (isValid(board, row, col, num)) {
19
20                            // Place number
21                            board[row][col] = num;
22
23                            // Solve remaining cells
24                            if (solve(board)) {
25                                return true;
26                            }
27
28                            // Undo
29                            board[row][col] = '.';
30                        }
31                    }
32
33                    // No number works
34                    return false;
35                }
36            }
37        }
38
39        // No empty cells → Sudoku solved
40        return true;
41    }
42
43    public boolean isValid(char[][] board, int row, int col, char num) {
44
45        // Check row
46        for (int i = 0; i < 9; i++) {
47            if (board[row][i] == num) {
48                return false;
49            }
50        }
51
52        // Check column
53        for (int i = 0; i < 9; i++) {
54            if (board[i][col] == num) {
55                return false;
56            }
57        }
58
59        // Check 3x3 box
60        int startRow = (row / 3) * 3;
61        int startCol = (col / 3) * 3;
62
63        for (int i = startRow; i < startRow + 3; i++) {
64            for (int j = startCol; j < startCol + 3; j++) {
65                if (board[i][j] == num) {
66                    return false;
67                }
68            }
69        }
70
71        return true;
72    }
73}