class Problem3{
		
	public static void main(String[]args){
		int sum=0;
		int number=11;
		for(int i=2;i<=number;i++){
				
			if(Prime(i)){
				sum=sum+i;
				}
			}
		System.out.println(sum);
		}
		public static boolean Prime(int number){
			boolean result=true;
			for(int i=2;i<number;i++){
			
					if(number%i==0){
					result=false;
				}
			}
		
					
				return result;
		}
	}
	









































