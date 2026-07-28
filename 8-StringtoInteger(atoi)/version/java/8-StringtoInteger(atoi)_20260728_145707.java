// Last updated: 7/28/2026, 2:57:07 PM
1class Solution {
2    public String countAndSay(int n) {
3        String result = "1";
4
5        for (int i = 2; i <= n; i++) {
6            StringBuilder temp = new StringBuilder();
7            int count = 1;
8
9            for (int j = 1; j < result.length(); j++) {
10                if (result.charAt(j) == result.charAt(j - 1)) {
11                    count++;
12                } else {
13                    temp.append(count);
14                    temp.append(result.charAt(j - 1));
15                    count = 1;
16                }
17            }
18
19            temp.append(count);
20            temp.append(result.charAt(result.length() - 1));
21
22            result = temp.toString();
23        }
24
25        return result;
26    }
27}