import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CourseSchedule {
    public static void main(String[] args) {
        CourseSchedule solution = new CourseSchedule();
        int numCourses = 2;
        int[][] prerequisites = { { 1, 0 }, { 0, 1 } };
        boolean ans = solution.input(numCourses, prerequisites);
        System.out.println(ans);
        // input(numCourses, prerequisites);
    }

    public boolean input(int n, int[][] p) {
        int top_sort[] = new int[n];
        int indegree[] = new int[n];

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < p.length; i++) {
            adj.get(p[i][1]).add(p[i][0]);
        }
        for (int i = 0; i < n; i++) {
            for (Integer it : adj.get(i)) {
                indegree[it]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }
        int c = 0;
        while (!q.isEmpty()) {
            Integer curr = q.poll();
            top_sort[c++] = curr;
            for (Integer i : adj.get(curr)) {
                indegree[i]--;
                if (indegree[i] == 0)
                    q.add(i);
            }
        }
        if (c == n)
            return true;
        return false;
    }
}
