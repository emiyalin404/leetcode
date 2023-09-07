
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "bacrbcbb";
        input(s);
    }

    public static void input(String s) {
        int max = 0, start = 0;
        int[] last = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            start = Math.max(start, last[current] + 1);
            last[current] = i;
            max = Math.max(max, i - start + 1);
        }
        System.out.println(max);
    }
}
