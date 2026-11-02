import java.util.*;

class Solution {

    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        if (digits.length() == 0) {
            return result;
        }

        String[] mapping = {
            "", "", "abc", "def",
            "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz"
        };

        backtrack(digits, 0, "", result, mapping);

        return result;
    }

    public void backtrack(String digits, int index,
                          String current,
                          List<String> result,
                          String[] mapping) {

        // Base condition
        if (index == digits.length()) {
            result.add(current);
            return;
        }

        // Get letters corresponding to digit
        String letters = mapping[digits.charAt(index) - '0'];

        for (int i = 0; i < letters.length(); i++) {

            // Choose
            char ch = letters.charAt(i);

            // Explore
            backtrack(digits, index + 1, current + ch,
                      result, mapping);
        }
    }
}