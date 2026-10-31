import java.util.*;
class Solution {
    public String reversePrefix(String word, char ch) {
        int x=word.indexOf(ch);

        StringBuilder sb=new StringBuilder(word.substring(0,x+1));
        sb.reverse();

        return sb.toString()+word.substring(x+1);
    }
}