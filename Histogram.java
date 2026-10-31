class Histogram{
			
		public static void main(String[] args){
			
			int[] arr={2,1,5,6,2,3};
			//int[] arr={2,1,2,3,4};
			
			int maxArea=0;
			int area=0;
			for(int i=0;i<arr.length;i++){
				int minHeight=arr[i];
					for(int j=i;j<arr.length;j++){
					minHeight=Math.min(minHeight,arr[j]);
						 int width=j-i+1;
						
						 area=minHeight*width;
					
						maxArea=Math.max(area,maxArea);
					}
					
				}
			System.out.println(maxArea);
		
		}

	
}