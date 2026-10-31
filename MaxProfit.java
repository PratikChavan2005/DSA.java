class MaxProfit{
		
	
	public static void main(String[] args){
	
		int[] profit = {5,7,6,4,3,1};	
		int prof=0;
		int minProfit=profit[0];
		for(int i=0;i<profit.length;i++){
		
			minProfit=Math.min(minProfit,profit[i]);
			
			 prof=Math.max(prof,profit[i]-minProfit);
		}
		System.out.println(prof);
	}	
}