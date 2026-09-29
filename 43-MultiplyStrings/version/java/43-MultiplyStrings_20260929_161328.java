// Last updated: 9/29/2026, 4:13:28 PM
1class Solution {
2    public String multiply(String num1, String num2) {
3
4        if (num1.equals("0") || num2.equals("0")) {
5            return "0";
6        }
7
8        int[] result = new int[num1.length() + num2.length()];
9
10        for (int i = num1.length() - 1; i >= 0; i--) {
11
12            for (int j = num2.length() - 1; j >= 0; j--) {
13
14                int n1 = num1.charAt(i) - '0';
15                int n2 = num2.charAt(j) - '0';
16
17                int product = n1 * n2;
18
19                int pos1 = i + j;
20                int pos2 = i + j + 1;
21
22                int sum = product + result[pos2];
23
24                result[pos2] = sum % 10;
25                result[pos1] += sum / 10;
26            }
27        }
28
29        StringBuilder answer = new StringBuilder();
30
31        for (int digit : result) {
32            if (answer.length() == 0 && digit == 0) {
33                continue;
34            }
35
36            answer.append(digit);
37        }
38
39        return answer.toString();
40    }
41}