import java.util.*;
class GenerateParenthesis{
		
		public static void main(String[] args){
		List<String> ans=new ArrayList<>();
			int n=3;
			backTrack(ans,"",0,0,n);
		System.out.println(ans);	
	}
	public static void backTrack(List<String> ans , String s,int open , int close , int n ){
	
		if(s.length()==n*2){
			ans.add(s);
			return ;
		}
		
		if(open < n){	
			backTrack(ans,s+"(" , open+1,close,n);	
		}
		if(close < open ){
			backTrack(ans,s+")" , open , close+1,n);
		}
	}
}