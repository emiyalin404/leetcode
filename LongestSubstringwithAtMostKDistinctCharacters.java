import java.util.HashMap;
// import java.util.Map;

public class LongestSubstringwithAtMostKDistinctCharacters {
    public static void main(String[] args) {
        int k = 2;
        String str = "eceba";
        input(k, str);
    }

    public static void input(int k, String s) {
        int maxlength = 0, start = 0;
        HashMap<Character, Integer> table = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            table.put(current, table.getOrDefault(current, 0) + 1);
            while (table.size() > k) {
                char leftChar = s.charAt(i);
                if (table.containsKey(leftChar)) {
                    table.put(leftChar, table.get(leftChar) - 1);
                    if (table.get(leftChar) == 0) {
                        table.remove(leftChar);
                    }
                }
                start++;
            }
            maxlength = Math.max(maxlength, i - start + 1);
        }
        System.out.println(maxlength);
        // int maxLength = 0, windowStart = 0;
        // HashMap<Character, Integer> table = new HashMap<>();

        // for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
        // char currentChar = s.charAt(windowEnd);
        // table.put(currentChar, table.getOrDefault(currentChar, 0) + 1);

        // // 如果 table 的大小超過 k，則需要調整窗口的起始位置
        // while (table.size() > k) {
        // char leftChar = s.charAt(windowStart);
        // if (table.containsKey(leftChar)) {
        // table.put(leftChar, table.get(leftChar) - 1);
        // if (table.get(leftChar) == 0) {
        // table.remove(leftChar);
        // }
        // }
        // windowStart++;
        // }

        // // 更新最大子串長度
        // maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        // }
        // System.out.println(maxLength);
        // // return maxLength;
    }
}
