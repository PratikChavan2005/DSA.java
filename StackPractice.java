import java.util.*;
class StackPractice{
	
	public static void main(String[] args){
	
		int[] height = {2, 1, 5, 6, 2, 3};
		Stack<Integer> stack = new Stack<>();
		int n=height.length;
		int maxArea=0;
		
		for(int i=0;i<n;i++){
		
				while(!stack.isEmpty() && height[i] < height[stack.peek()]){
					
					int index=stack.pop();
					int Height=height[index];
					
					int width=0;
				
						if(stack.isEmpty()){
							width=i;
						}
						else {
							width=i-stack.peek()-1;
						}
						
					int area = Height*width;
					maxArea=Math.max(area,maxArea);
					
					
				}
				stack.push(i);
			}
		
			while(!stack.isEmpty()){
				int index = stack.pop();
				int Height=height[index];
				int width=0;
				if(stack.isEmpty()){
					width=height.length;	
				}
				else {
					width = height.length-stack.peek()-1;
				}
				
				int area = Height*width;
				maxArea=Math.max(area,maxArea);
			}
		System.out.println(maxArea);
		
	}	
}