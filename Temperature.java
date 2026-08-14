import java.util.*;
class Temperature{
	
	public static void main(String[] args){
		
		Stack<Integer> stack = new Stack<>();
		int[] arr={73,70,71,74,69,75,68};
		int[] ans=new int[arr.length];
		Arrays.fill(ans,0);
		
		for(int i=arr.length-1;i>=0;i--){
		
			while(!stack.isEmpty() && arr[stack.peek()]<arr[i]){
			
				stack.pop();
			}
			
			if(!stack.isEmpty()){
				
				ans[i]=stack.peek()-i;
			}
			stack.push(i);
		}
		
		for(int e: ans){
		
			System.out.println(e);
		}
		
		
		
	}	
}