// Last updated: 7/28/2026, 3:58:17 PM
1import java.util.*;
2
3class Solution {
4    public boolean isHappy(int n) {
5        Set<Integer> seen = new HashSet<>();
6
7        while (n != 1 && !seen.contains(n)) {
8            seen.add(n);
9            n = getNext(n);
10        }
11
12        return n == 1;
13    }
14
15    private int getNext(int n) {
16        int sum = 0;
17
18        while (n > 0) {
19            int digit = n % 10;
20            sum += digit * digit;
21            n /= 10;
22        }
23
24        return sum;
25    }
26}