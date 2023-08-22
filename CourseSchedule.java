import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CourseSchedule {
    public static void main(String[] args) {
        int numCourses = 2;
        int[][] prerequisites = { { 1, 0 }, { 0, 1 } };
        input(numCourses, prerequisites);
    }

    public static void input(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(numCourses);
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        int[] inDegree = new int[numCourses];
        for (int[] a : prerequisites) {
            int course = a[0];
            int pre_course = a[1];
            graph.get(pre_course).add(course);
            inDegree[course]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0)
                queue.offer(i);
        }
        while (queue.size() > 0) {
            int curr = queue.poll();
            count++;
            for (int item : graph.get(curr)) {
                inDegree[item]--;
                if (inDegree[item] == 0)
                    queue.offer(item);
            }
        }

        System.out.println(count == numCourses);
        // return count == numCourses;
    }
}
