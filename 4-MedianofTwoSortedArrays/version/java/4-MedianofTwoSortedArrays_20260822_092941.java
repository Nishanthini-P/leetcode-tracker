// Last updated: 8/22/2026, 9:29:41 AM
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3
4        // Always binary search on smaller array
5        if (nums1.length > nums2.length) {
6            return findMedianSortedArrays(nums2, nums1);
7        }
8
9        int m = nums1.length;
10        int n = nums2.length;
11
12        int low = 0;
13        int high = m;
14
15        while (low <= high) {
16
17            int cut1 = (low + high) / 2;
18            int cut2 = (m + n + 1) / 2 - cut1;
19
20            int left1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
21            int right1 = (cut1 == m) ? Integer.MAX_VALUE : nums1[cut1];
22
23            int left2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];
24            int right2 = (cut2 == n) ? Integer.MAX_VALUE : nums2[cut2];
25
26            // Correct partition
27            if (left1 <= right2 && left2 <= right1) {
28
29                // Total length is odd
30                if ((m + n) % 2 == 1) {
31                    return Math.max(left1, left2);
32                }
33
34                // Total length is even
35                return (Math.max(left1, left2)
36                        + Math.min(right1, right2)) / 2.0;
37            }
38
39            // Move left
40            else if (left1 > right2) {
41                high = cut1 - 1;
42            }
43
44            // Move right
45            else {
46                low = cut1 + 1;
47            }
48        }
49
50        return 0.0;
51    }
52}