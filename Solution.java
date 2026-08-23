class Solution {
    public boolean sumGame(String s) {
        int n=s.length();
        int half=n/2;

        int leftSum=0;
        int rightSum=0;

        int leftQ=0;
        int rightQ=0;

        for(int i=0;i<half;i++){
                char ch=s.charAt(i);
                if(ch == '?'){
                    leftQ++;
                }
                else {
                    leftSum+=s.charAt(i)-'0';
                }
        }
        for(int i=half;i<n;i++){
            char ch=s.charAt(i);
            if(ch == '?'){
                rightQ++;
            }
            else {
                rightSum+=s.charAt(i)-'0';
            }
        }
        if(leftQ!=rightQ){
            return true;
        }
        return leftSum!=rightSum;
    }
}