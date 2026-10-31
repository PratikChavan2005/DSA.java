import java.util.Stack;
import java.util.*;
class NextGreaterElement{
	
	public static void main(String[] args){
		
		int[] arr={3,2,1,4};
		int[] ans=new int[arr.length];
		Stack<Integer> stack = new Stack<>();
		for(int i=arr.length-1;i>=0;i--){
			
			while(!stack.isEmpty() && stack.peek()<arr[i]){
				stack.pop();
			}
				if(stack.isEmpty()){
			
					ans[i]=-1;
				}
				else {
					ans[i]=stack.peek();
				}
			stack.push(arr[i]);
			}
		
		for(int e : ans){
			System.out.println(e);
		}
		
	}	
}