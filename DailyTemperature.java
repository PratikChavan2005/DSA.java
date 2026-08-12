import java.util.*;
class DailyTemperature{
	
	public static void main(String[] args){
	
		int[] T={73,74,75,71,69,72,76,73};
		int[] ans=new int[T.length];
		Arrays.fill(ans,0);
		Stack<Integer> stack = new Stack<>();
		
		for(int i=T.length-1;i>=0;i--){
			
			while(!stack.isEmpty() && T[stack.peek()]<T[i]){
				stack.pop();
			}
			if(!stack.isEmpty()){
				ans[i]=stack.peek()-i;
			}
			stack.push(i);
		}
		for(int e:ans){
			System.out.print(e + " ");
		}
		
	}	
}