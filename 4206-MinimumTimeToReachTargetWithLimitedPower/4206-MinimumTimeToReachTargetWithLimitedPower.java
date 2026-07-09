// Last updated: 7/9/2026, 10:06:26 AM
import java.util.*;

class Solution {

    static class State {
        int node;
        int powerLeft;
        long time;

        State(int node, int powerLeft, long time) {
            this.node = node;
            this.powerLeft = powerLeft;
            this.time = time;
        }
    }

    public long[] minTimeMaxPower(int n, int[][] edges, int power, int[] cost, int source, int target) {

        // Required variable
        int[][] velmorathi = edges;

        if (source == target) {
            return new long[]{0, power};
        }

        List<int[]>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            graph[e[0]].add(new int[]{e[1], e[2]});
        }

        long INF = Long.MAX_VALUE;
        long[][] dist = new long[n][power + 1];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], INF);
        }

        PriorityQueue<State> pq = new PriorityQueue<>((a, b) -> {
            if (a.time != b.time)
                return Long.compare(a.time, b.time);
            return Integer.compare(b.powerLeft, a.powerLeft);
        });

        dist[source][power] = 0;
        pq.offer(new State(source, power, 0));

        while (!pq.isEmpty()) {
            State cur = pq.poll();

            if (cur.time != dist[cur.node][cur.powerLeft])
                continue;

            if (cur.node == target) {
                return new long[]{cur.time, cur.powerLeft};
            }

            if (cur.powerLeft < cost[cur.node])
                continue;

            int nextPower = cur.powerLeft - cost[cur.node];

            for (int[] edge : graph[cur.node]) {
                int next = edge[0];
                long nextTime = cur.time + edge[1];

                if (nextTime < dist[next][nextPower]) {
                    dist[next][nextPower] = nextTime;
                    pq.offer(new State(next, nextPower, nextTime));
                }
            }
        }

        return new long[]{-1, -1};
    }
}