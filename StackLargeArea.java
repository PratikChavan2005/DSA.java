import java.util.*;
class StackLargeArea{
	
	public static void main(String[] args){
	
		int[] arr={2,1,5,6,4,3};
		int n=arr.length;
		Stack<Integer> stack = new Stack<>();
		
		int max=0;
		for(int i=0; i<=n; i++){
			int h= (i==n) ? 0 : arr[i];
			
			while(!stack.isEmpty() && h<arr[stack.peek()]){
				int area=0;
				int height=arr[stack.pop()];
				int width = stack.isEmpty() ? i : i-stack.peek()-1;
				area=height*width;
				max=Math.max(max,area);
				 
			}
			stack.push(i);
		}
		System.out.println(max);
	}	
}