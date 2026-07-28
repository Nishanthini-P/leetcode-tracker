// Last updated: 7/28/2026, 4:03:41 PM
1import java.util.*;
2
3class MyStack {
4
5    Queue<Integer> q1;
6    Queue<Integer> q2;
7
8    public MyStack() {
9        q1 = new LinkedList<>();
10        q2 = new LinkedList<>();
11    }
12
13    public void push(int x) {
14        q2.offer(x);
15
16        while (!q1.isEmpty()) {
17            q2.offer(q1.poll());
18        }
19
20        Queue<Integer> temp = q1;
21        q1 = q2;
22        q2 = temp;
23    }
24
25    public int pop() {
26        return q1.poll();
27    }
28
29    public int top() {
30        return q1.peek();
31    }
32
33    public boolean empty() {
34        return q1.isEmpty();
35    }
36}
37
38
39/**
40 * Your MyStack object will be instantiated and called as such:
41 * MyStack obj = new MyStack();
42 * obj.push(x);
43 * int param_2 = obj.pop();
44 * int param_3 = obj.top();
45 * boolean param_4 = obj.empty();
46 */