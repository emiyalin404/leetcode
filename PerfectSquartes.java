import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class PerfectSquartes {
    public static void main(String[] args) {
        int n = 12;
        input(n);
    }

    public static void input(int n) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> reviewedSet = new HashSet<>();

        if (n > 0)
            queue.offer(n);
        int level = 0;
        while (!queue.isEmpty()) {
            level++;
            int size = queue.size();
            for (int i = 1; i <= size; i++) {
                int val = queue.poll();
                if (!reviewedSet.add(val))
                    continue;

                for (int j = 1; j <= Math.sqrt(val); j++) {
                    if (val - (j * j) == 0)
                        System.out.print(level + ",");
                    // return level;
                    queue.offer(val - (j * j));
                }
            }
        }
        // System.out.print(level + ",j8");
        // return level;
    }
}
