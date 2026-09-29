// Last updated: 9/29/2026, 4:18:14 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3
4        int buy1 = Integer.MIN_VALUE;
5        int sell1 = 0;
6
7        int buy2 = Integer.MIN_VALUE;
8        int sell2 = 0;
9
10        for (int price : prices) {
11
12            buy1 = Math.max(buy1, -price);
13
14            sell1 = Math.max(sell1, buy1 + price);
15
16            buy2 = Math.max(buy2, sell1 - price);
17
18            sell2 = Math.max(sell2, buy2 + price);
19        }
20
21        return sell2;
22    }
23}