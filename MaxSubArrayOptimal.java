class MaxSubArrayOptimal{
	
	public static void main(String[] args){
	
		int[] arr={-2,1,-3,4,-1,2,1,-5,4};
		int max=0;
		int sum=0;

		for(int num:arr){
			sum+=num;
			max=Math.max(max,sum);
			
			if(sum<0){
				sum=0;
			}
		}
		System.out.println(max);	
	}	
}