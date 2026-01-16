import java.util.*;
public class DayEleven {




        public static List<String> permute(String s) {
            List<String> result = new ArrayList<>();
            boolean[] used = new boolean[s.length()];
            char[] chars = s.toCharArray();
            Arrays.sort(chars); // sorting helps avoid duplicates
            backtrack(chars, new StringBuilder(), used, result);
            return result;
        }

        private static void backtrack(char[] chars, StringBuilder current, boolean[] used, List<String> result) {
            if (current.length() == chars.length) {
                result.add(current.toString());
                return;
            }

            for (int i = 0; i < chars.length; i++) {
                // Skip if already used
                if (used[i]) continue;

                // Skip duplicates: if char is same as previous and previous wasn't used
                if (i > 0 && chars[i] == chars[i - 1] && !used[i - 1]) continue;

                // Choose
                used[i] = true;
                current.append(chars[i]);

                // Explore
                backtrack(chars, current, used, result);

                // Unchoose (backtrack)
                current.deleteCharAt(current.length() - 1);
                used[i] = false;
            }
        }

        public static void main(String[] args) {
            String input = "abc";
            List<String> output = permute(input);
            System.out.println("Input: " + input);
            System.out.println("Output: " + output);
        }
    }


