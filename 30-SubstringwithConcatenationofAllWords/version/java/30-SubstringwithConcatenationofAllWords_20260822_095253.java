// Last updated: 8/22/2026, 9:52:53 AM
1class Solution {
2    public String getPermutation(int n, int k) {
3
4        List<Integer> nums = new ArrayList<>();
5
6        // Store 1 to n
7        for (int i = 1; i <= n; i++) {
8            nums.add(i);
9        }
10
11        // Calculate (n-1)!
12        int fact = 1;
13        for (int i = 1; i < n; i++) {
14            fact *= i;
15        }
16
17        StringBuilder ans = new StringBuilder();
18
19        // Convert k to 0-based
20        k--;
21
22        while (n > 0) {
23
24            int index = k / fact;
25
26            ans.append(nums.get(index));
27            nums.remove(index);
28
29            k = k % fact;
30
31            n--;
32
33            if (n > 0) {
34                fact = fact / n;
35            }
36        }
37
38        return ans.toString();
39    }
40}