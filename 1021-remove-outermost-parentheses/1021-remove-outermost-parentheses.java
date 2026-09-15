class Solution {
    public String removeOuterParentheses(String s) {
        
        StringBuilder ans = new StringBuilder();
        int depth = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                depth++;

                
                if (depth > 1) {
                    ans.append(ch);
                }
            } 
            else {
               
                if (depth > 1) {
                    ans.append(ch);
                }

                depth--;
            }
        }

        return ans.toString();
    }
}