// Last updated: 8/22/2026, 9:59:08 AM
1class Solution {
2    public List<String> fullJustify(String[] words, int maxWidth) {
3
4        List<String> ans = new ArrayList<>();
5
6        int i = 0;
7
8        while (i < words.length) {
9
10            int j = i;
11            int letters = 0;
12
13            // Find words that fit in this line
14            while (j < words.length &&
15                   letters + words[j].length() + (j - i) <= maxWidth) {
16
17                letters += words[j].length();
18                j++;
19            }
20
21            int gaps = j - i - 1;
22            int spaces = maxWidth - letters;
23
24            StringBuilder line = new StringBuilder();
25
26            // Last line OR only one word
27            if (j == words.length || gaps == 0) {
28
29                for (int k = i; k < j; k++) {
30
31                    line.append(words[k]);
32
33                    if (k < j - 1) {
34                        line.append(" ");
35                    }
36                }
37
38                // Add remaining spaces at the end
39                while (line.length() < maxWidth) {
40                    line.append(" ");
41                }
42
43            } else {
44
45                // Fully justified line
46                int each = spaces / gaps;
47                int extra = spaces % gaps;
48
49                for (int k = i; k < j; k++) {
50
51                    line.append(words[k]);
52
53                    if (k < j - 1) {
54
55                        // Extra spaces go to left gaps
56                        int count = each;
57
58                        if (extra > 0) {
59                            count++;
60                            extra--;
61                        }
62
63                        for (int x = 0; x < count; x++) {
64                            line.append(" ");
65                        }
66                    }
67                }
68            }
69
70            ans.add(line.toString());
71
72            i = j;
73        }
74
75        return ans;
76    }
77}