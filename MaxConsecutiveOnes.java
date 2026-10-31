class MaxConsecutiveOnes{

	public static void main(String[] args){
	
		int[] nums={1,1,1,0,0,0,1,1,1,1,0};
		int k=2;
		
		int maxLength=0;
		int countZero=0;
		
	for(int left=0;left<nums.length;left++){
		
		for(int right=0;right<nums.length;right++){
			
				if(nums[right]==0){  
					countZero++;
				}
				if(countZero>k){
					maxLength=Math.max(maxLength,right-left+1);
					break;
				}
			}
		    
			
		}
		System.out.println(maxLength);
		
	}	
}