// Find if Path Exists in Graph [Easy]
// https://leetcode.com/problems/find-if-path-exists-in-graph/

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }

        boolean[] visited = new boolean[n];
        Deque<Integer> q = new ArrayDeque<>();
        q.add(source);
        visited[source] = true;

        while (!q.isEmpty()) {
            int cur = q.poll();
            if (cur == destination) return true;
            for (int nb : adj.get(cur)) {
                if (!visited[nb]) {
                    visited[nb] = true;
                    q.add(nb);
                }
            }
        }
        return false;
    }
}