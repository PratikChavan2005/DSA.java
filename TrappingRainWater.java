class TrappingRainWater{
	
	public static void main(String[]args){
		
		int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
	//height = [0,1,0,2,1,0,1,3,2,1,2,1];
	//height = [4,2,0,3,2,5];
		int n=height.length;
		int left=0;
		int right=n-1;
		int leftmax=height[left];
		int rightmax=height[right];
		int water=0;
		while(left<right){
			if(leftmax<rightmax){
				left++;
				leftmax=Math.max(leftmax,height[left]);
				water=water+leftmax-height[left];
			}else {
				
				right--;
				rightmax=Math.max(rightmax,height[right]);
				water=water+rightmax-height[right];
				
			}
		}
		System.out.println(water);
	}	
	
}