import java.util.*;
class AsteroidCollision{
	
	public static void main(String[] args){
		
		int[] arr={5,10,-10};
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<arr.length;i++){
			
			while(!stack.isEmpty() && stack.peek()>0 && arr[i]<0 && stack.peek()<-arr[i]){
				stack.pop();
			}
			if(!stack.isEmpty() && arr[i]<0){
				if(stack.peek()==-arr[i]){
					stack.pop();	
				}
			}
			else {
				stack.push(arr[i]);
			}
		}
		int[] ans=new int[stack.size()];
		for(int i=stack.size()-1;i>=0;i--){
			ans[i]=stack.pop();
			
		}
		for(int e:ans){
		System.out.println(e);
		}
		
		
	}
}