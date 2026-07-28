// Last updated: 7/28/2026, 4:05:18 PM
1public class Solution extends VersionControl {
2    public int firstBadVersion(int n) {
3        int left = 1;
4        int right = n;
5
6        while (left < right) {
7            int mid = left + (right - left) / 2;
8
9            if (isBadVersion(mid)) {
10                right = mid;
11            } else {
12                left = mid + 1;
13            }
14        }
15
16        return left;
17    }
18}