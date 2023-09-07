// import java.util.HashSet;
// import java.util.LinkedList;
// import java.util.Queue;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class OpenTheLock {
    public static void main(String[] args) {
        OpenTheLock solution = new OpenTheLock();
        String[] deadends = {
                "0201", "0101", "0102", "1212", "2002"
        };
        String target = "0202";
        solution.input(deadends, target);
    }

    public void input(String[] deadends, String target) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < deadends.length; i++) {
            set.add(deadends[i]);
        }
        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        q.add("0000");
        visited.add("0000");
        int steps = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int j = 0; j < size; j++) {
                String current = q.poll();
                if (current.equals(target))
                    System.out.print(steps);
                // return steps;
                StringBuilder sb = new StringBuilder(current);
                for (int i = 0; i < 4; i++) {
                    char c = sb.charAt(i);
                    String s1 = sb.substring(0, i) + (c == '9' ? 0 : c - '0' + 1) + sb.substring(i + 1);
                    String s2 = sb.substring(0, i) + (c == '0' ? 9 : c - '0' - 1) + sb.substring(i + 1);
                    if (!visited.contains(s1) && !set.contains(current)) {
                        visited.add(s1);
                        q.offer(s1);
                    }
                    if (!visited.contains(s2) && !set.contains(current)) {
                        visited.add(s2);
                        q.offer(s2);
                    }
                }
            }
            steps++;
        }
        // return -1;
        // HashSet<String> visited = new HashSet<>();
        // HashSet<String> deads = new HashSet<>();
        // for (String each : deadends) {
        // deads.add(each);
        // }
        // Queue<String> q = new LinkedList<>();
        // visited.add("0000");
        // q.add("0000");
        // int result = 0;
        // while (!q.isEmpty()) {
        // int size = q.size();
        // for (int i = 0; i < size; i++) {
        // String curr = q.poll();
        // if (deads.contains(curr))
        // continue;
        // if (curr.equals(target))
        // System.out.println(result);
        // // return result;
        // for (int a = 0; a < 4; a++) {
        // String up = add1(curr, a);
        // String down = minus1(curr, a);
        // if (!visited.contains(up)) {
        // q.offer(up);
        // visited.add(up);
        // }
        // if (!visited.contains(down)) {
        // q.offer(down);
        // visited.add(down);
        // }
        // }
        // }
        // ++result;
        // }
        // // return -1;
        // System.out.println(-1);
        // }

        // private String add1(String str, int i) {
        // char[] ch = str.toCharArray();
        // if (ch[i] == '9')
        // ch[i] = '0';
        // else
        // ch[i] += 1;
        // return new String(ch);
        // }

        // private String minus1(String str, int i) {
        // char[] ch = str.toCharArray();
        // if (ch[i] == '0')
        // ch[i] = '9';
        // else
        // ch[i] -= 1;
        // return new String(ch);
    }
}
