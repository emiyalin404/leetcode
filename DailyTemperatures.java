import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] temperatures = { 73, 74, 75, 71, 69, 72, 76, 73 };
        input(temperatures);
    }

    public static void input(int[] temperatures) {
        int n = temperatures.length;
        int res[] = new int[n];

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && temperatures[i] > temperatures[st.peek()]) {
                res[st.peek()] = i - st.peek();
                st.pop();
            }
            st.push(i);
        }
        // return res;
        for (var each : res) {
            System.out.print(each + ",");
        }

    }
}
