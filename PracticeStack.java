import java.util.*;
class PracticeStack{
	
	public static void main(String[] args){
		
		int[] arr = {2, 1, 5, 6, 2, 3};	
		Stack<Integer> stack = new Stack<>();
		int maxArea=0;
		int n=arr.length;
		for(int i=0;i<n;i++){	
		
			while(!stack.isEmpty() && arr[i]<arr[stack.peek()]){

				int index=stack.pop();
				int Height=arr[index];
				int width=0;

				if(stack.isEmpty()){
					width=i;	
				}
				else{
					width=i-stack.peek()-1;
				}
				int area=Height*width;
				maxArea=Math.max(area,maxArea);
				
			}
			stack.push(i);
		}	
			while(!stack.isEmpty()){
			
				int index=stack.pop();
				int Height=arr[index];
				
				int width=0;
				
				if(stack.isEmpty()){
					width=arr.length;
				}
				else {
					width = arr.length-stack.peek()-1;
				}
				int area=Height*width;
				maxArea=Math.max(area,maxArea);
			}
		System.out.println(maxArea);

	}	
}