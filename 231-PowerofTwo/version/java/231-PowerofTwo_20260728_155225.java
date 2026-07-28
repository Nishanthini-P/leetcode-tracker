// Last updated: 7/28/2026, 3:52:25 PM
1class Solution {
2    public boolean isPowerOfTwo(int n) {
3        return n > 0 && (n & (n - 1)) == 0;
4    }
5}
6