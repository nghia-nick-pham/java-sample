package java_algorithm.dynamic_programming.optimal_structure;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

class ShortestPath {
    static final int INF = Integer.MAX_VALUE;

    static int shortestPath(int[][] graph, int u, int v) {
        int n = graph.length;
        int[][] dp = new int[n][n];
        for (int[] row : dp) {
            Arrays.fill(row, INF);
        }

        dp[u][u] = 0;

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                for (int z = 0; z < n; z++) {
//                    if (graph[x][y] != INF)
                        dp[x][y] = Math.min(graph[x][y], graph[x][z] + graph[z][y]);
//                    }
                }
            }
        }

        return dp[u][v];
    }

    public static void main(String[] args) {
        // Example graph
        int[][] graph = {
                {0, 5, INF, 10},
                {INF, 0, 3, INF},
                {INF, INF, 0, 1},
                {INF, INF, INF, 0}
        };
        // directed
//         10
//      (0)--------->(3)
//       |            /|\
//       5|             |
//       |             |2
//       \|/            |
//      (1)--------->(2)
//         3
        int shortestPath = shortestPath(graph, 0, 3);
        System.out.println("Shortest path from 0 to 3: " + shortestPath);
    }
}

