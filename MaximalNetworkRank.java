import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MaximalNetworkRank {
    public static void main(String[] args) {
        int[][] roads = { { 0, 1 }, { 0, 3 }, { 1, 2 }, { 1, 3 } };
        int n = 4;
        input(roads, n);
    }

    public static void input(int[][] roads, int n) {

        int[] cityCounts = new int[n];
        Map<Integer, Set<Integer>> connections = new HashMap<>();

        for (int[] road : roads) {
            int a = road[0];
            int b = road[1];
            cityCounts[a]++;
            cityCounts[b]++;
            connections.computeIfAbsent(a, k -> new HashSet<>()).add(b);
            connections.computeIfAbsent(b, k -> new HashSet<>()).add(a);
        }

        int maximalRank = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int rank = cityCounts[i] + cityCounts[j];
                if (connections.containsKey(i) && connections.get(i).contains(j)) {
                    rank--;
                }
                maximalRank = Math.max(maximalRank, rank);
            }
        }
        System.out.println(maximalRank);
        // -------------------------------------------------------------------
        // int[] cityCounts = new int[n];
        // Map<Integer, Set<Integer>> connections = new HashMap<>();

        // for (int[] road : roads) {
        // int a = road[0];
        // int b = road[1];
        // cityCounts[a]++;
        // cityCounts[b]++;
        // connections.computeIfAbsent(a, k -> new HashSet<>()).add(b);
        // connections.computeIfAbsent(b, k -> new HashSet<>()).add(a);
        // }
        // System.out.println(connections);
        // int maximalRank = 0;

        // for (int i = 0; i < n; i++) {
        // for (int j = i + 1; j < n; j++) {
        // int rank = cityCounts[i] + cityCounts[j];
        // if (connections.containsKey(i) && connections.get(i).contains(j)) {
        // rank--;
        // }
        // maximalRank = Math.max(maximalRank, rank);
        // }
        // }
        // System.out.println(maximalRank);
    }
}
