import java.util.*;
class MaxRectangleOptimal{
		
		public static int Area(int[] heights){
		
			Stack<Integer> stack = new Stack<>();
			int n= heights.length;
			int area=0;
			int maxarea=0;
			for(int i=0;i<=n;i++){
			
				int h=(i==n) ? 0:heights[i];
				while(!stack.isEmpty() && h<heights[stack.peek()]){
					int height=heights[stack.pop()];
					int width = stack.isEmpty() ? i : i-stack.peek()-1;
					 area = height*width;	
					maxarea=Math.max(maxarea,area);
					
				}
				stack.push(i);
			}
			return maxarea;
			
		}
	
	public static void main(String[] args){
	
		char[][] matrix = {
    {'1', '0', '1', '0', '0'},
    {'1', '0', '1', '1', '1'},
    {'1', '1', '1', '1', '1'},
    {'1', '0', '0', '1', '0'}
	};
		int row=matrix.length;
		int col=matrix[0].length;
		int[] height=new int[col];
		int max=0;
		
		for(int i=0;i<row;i++){
		
			for(int j=0;j<col;j++){
				
				if(matrix[i][j]=='1'){
					height[j]+=1;
				}
				else {
					height[j]=0;
				}
			}
			max=Math.max(max,Area(height));
		}
		System.out.println(max);
	
	}
		
}