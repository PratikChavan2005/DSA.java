class Amazon1{
	
	static void minTime(int c1 , int c2 , int d1, int d2){
		
		int hour =1;
		while(d1>0 || d2>0){
			
			if(hour%c1!=0 && hour%c2!=0){
				
				if(d1>d2 && d1>0){
					d1--;
					}
					else if(d2>0) {
					d2--;
					}
				}
			
				else if(hour%c1!=0 && d1>0){
					d1--;
				}
				else if(hour%c2!=0 && d2>0){
					d2--;
				}
				hour++;
					
			   }
			System.out.println(hour-1);
		}		
		public static void main(String[]args){
		
		minTime(2,3,1,3);
		}
	
}