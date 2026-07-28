// Last updated: 7/28/2026, 2:55:01 PM
1import java.util.*;
2
3class Solution {
4    public List<Integer> grayCode(int n) {
5        List<Integer> result = new ArrayList<>();
6
7        int size = 1 << n;
8
9        for (int i = 0; i < size; i++) {
10            result.add(i ^ (i >> 1));
11        }
12
13        return result;
14    }
15}