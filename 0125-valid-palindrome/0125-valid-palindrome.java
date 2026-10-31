class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            char Leftchar=Character.toLowerCase(s.charAt(left));
            char Rightchar=Character.toLowerCase(s.charAt(right));
            left++;
            right--;
            if(Leftchar!=Rightchar){
                return false;
            }
        }
        return true;
    }
}