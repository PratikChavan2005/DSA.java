class MaximumSubArray{
		
		public static void main(String[]args){
		
			int[] arr={2,5,7,9,6,2,4,6,9,12,0};
				int k=4;
				int n=arr.length-1;
				int SumArray=0;
			for(int i=0;i<k;i++){
				
				SumArray=SumArray+arr[i];
			
			}
				int Max=SumArray;
			for(int j=k;j<n;j++){
				
				SumArray=SumArray+arr[j];
				SumArray=SumArray-arr[j-k];
				Max=Math.max(Max,SumArray);
			}
		System.out.println(Max);
		}
	
}