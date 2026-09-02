class Solution {
    public double myPow(double x, int n) {
        long a=n;
        if(a<0){
            x=1/x;
            a=-a;
        }
         double ans=1;
        while(a>0){
            if(a%2!=0){
                ans*=x;
            }
            x*=x;
            a/=2;
        }
        return ans;
    }
}