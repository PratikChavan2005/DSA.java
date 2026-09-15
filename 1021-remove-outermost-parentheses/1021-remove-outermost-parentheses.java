class Solution {
    public String removeOuterParentheses(String s) {
        
        StringBuilder ans = new StringBuilder();
        int depth = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                depth++;

                // Not an outer '('
                if (depth > 1) {
                    ans.append(ch);
                }
            } 
            else {
                // Not an outer ')'
                if (depth > 1) {
                    ans.append(ch);
                }

                depth--;
            }
        }

        return ans.toString();
    }
}