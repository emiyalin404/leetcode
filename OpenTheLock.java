import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

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
        HashSet<String> visited = new HashSet<>();
        HashSet<String> deads = new HashSet<>();
        for (String each : deadends) {
            deads.add(each);
        }
        Queue<String> q = new LinkedList<>();
        visited.add("0000");
        q.add("0000");
        int result = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                String curr = q.poll();
                if (deads.contains(curr))
                    continue;
                if (curr.equals(target))
                    System.out.println(result);
                // return result;
                for (int a = 0; a < 4; a++) {
                    String up = add1(curr, a);
                    String down = minus1(curr, a);
                    if (!visited.contains(up)) {
                        q.offer(up);
                        visited.add(up);
                    }
                    if (!visited.contains(down)) {
                        q.offer(down);
                        visited.add(down);
                    }
                }
            }
            ++result;
        }
        // return -1;
        System.out.println(-1);
    }

    private String add1(String str, int i) {
        char[] ch = str.toCharArray();
        if (ch[i] == '9')
            ch[i] = '0';
        else
            ch[i] += 1;
        return new String(ch);
    }

    private String minus1(String str, int i) {
        char[] ch = str.toCharArray();
        if (ch[i] == '0')
            ch[i] = '9';
        else
            ch[i] -= 1;
        return new String(ch);
    }
}
