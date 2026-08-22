// Last updated: 8/22/2026, 9:56:56 AM
1class Solution {
2    public boolean isNumber(String s) {
3
4        boolean digit = false;
5        boolean dot = false;
6        boolean e = false;
7
8        for (int i = 0; i < s.length(); i++) {
9
10            char c = s.charAt(i);
11
12            // Digit
13            if (Character.isDigit(c)) {
14                digit = true;
15            }
16
17            // Dot
18            else if (c == '.') {
19
20                // Dot not allowed after e
21                if (dot || e) {
22                    return false;
23                }
24
25                dot = true;
26            }
27
28            // e or E
29            else if (c == 'e' || c == 'E') {
30
31                // e must come after a digit
32                // and only one e is allowed
33                if (e || !digit) {
34                    return false;
35                }
36
37                e = true;
38                digit = false;
39            }
40
41            // + or -
42            else if (c == '+' || c == '-') {
43
44                // Sign is allowed only at beginning
45                // or immediately after e
46                if (i != 0 &&
47                    s.charAt(i - 1) != 'e' &&
48                    s.charAt(i - 1) != 'E') {
49                    return false;
50                }
51            }
52
53            // Anything else
54            else {
55                return false;
56            }
57        }
58
59        // Must have digits at the end
60        return digit;
61    }
62}