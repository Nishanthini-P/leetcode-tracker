// Last updated: 7/28/2026, 3:59:28 PM
1class Solution {
2    public int countPrimes(int n) {
3        if (n <= 2) {
4            return 0;
5        }
6
7        boolean[] isPrime = new boolean[n];
8
9        for (int i = 2; i < n; i++) {
10            isPrime[i] = true;
11        }
12
13        for (int i = 2; i * i < n; i++) {
14            if (isPrime[i]) {
15                for (int j = i * i; j < n; j += i) {
16                    isPrime[j] = false;
17                }
18            }
19        }
20
21        int count = 0;
22
23        for (int i = 2; i < n; i++) {
24            if (isPrime[i]) {
25                count++;
26            }
27        }
28
29        return count;
30    }
31}