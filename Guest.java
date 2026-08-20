class Guest{
	
	public static void main(String[]args){
		
		int[] E={7,0,5,1,3};
		int[] L={1,2,1,3,4};
	
		int max=0;
		int T=5;
		int guest=0;
		for(int i=0;i<T;i++){
			
			guest=guest+E[i]-L[i];
			max=Math.max(max,guest);
		}
		System.out.println(max);
	}	
}