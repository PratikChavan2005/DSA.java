import java.util.*;
class NextGreaterElementII{
	
	public static void main(String[] args){
		int[] arr={1,2,1};
		Stack<Integer> stack = new Stack<>();
		int[] ans=new int[arr.length];
		Arrays.fill(ans,-1);
		int n=arr.length;
		for(int i=2*n;i>=0;i--){
			int num=arr[i%n];
			while(!stack.isEmpty() && stack.peek()<=num){
				stack.pop();
			}
			if(i<n && !stack.isEmpty()){
				ans[i]=stack.peek();
			}
			stack.push(num);
		}
		for(int e:ans){
			System.out.println(e);
		}
	}	
}