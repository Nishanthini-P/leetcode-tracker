// Last updated: 7/28/2026, 4:01:07 PM
1import java.util.*;
2
3class Solution {
4    public boolean canFinish(int numCourses, int[][] prerequisites) {
5        List<List<Integer>> graph = new ArrayList<>();
6        int[] indegree = new int[numCourses];
7
8        for (int i = 0; i < numCourses; i++) {
9            graph.add(new ArrayList<>());
10        }
11
12        for (int[] pre : prerequisites) {
13            graph.get(pre[1]).add(pre[0]);
14            indegree[pre[0]]++;
15        }
16
17        Queue<Integer> queue = new LinkedList<>();
18
19        for (int i = 0; i < numCourses; i++) {
20            if (indegree[i] == 0) {
21                queue.offer(i);
22            }
23        }
24
25        int count = 0;
26
27        while (!queue.isEmpty()) {
28            int course = queue.poll();
29            count++;
30
31            for (int next : graph.get(course)) {
32                indegree[next]--;
33
34                if (indegree[next] == 0) {
35                    queue.offer(next);
36                }
37            }
38        }
39
40        return count == numCourses;
41    }
42}