class MaxConsecutiveOptimal{
	
	public static void main(String[] args){
		
		int[] nums={1,1,1,0,0,0,1,1,1,1,0};
		int max=0;
		int left=0;
		int countZero=0;
		int k=2;
		for(int right=0;right<nums.length;right++){
		
			if(nums[right]==0){
				countZero++;
			}
			
			if(countZero>k){
				
				if(nums[left]==0){
					countZero--;
				}
				left++;
			}
			max=Math.max(max,right-left+1);
		}
		
		System.out.println(max);
	}	
}