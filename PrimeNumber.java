class PrimeNumber{
	
	public static void main(String[] args){
	int start=25;
	int end = 35;
		for(int i=start;i<=end;i++){
			if(isPrime(i) && isPrime(isSum(i))){
			System.out.println(i);
			}
			
			
		}
	}
	public static boolean isPrime(int number){
	
			if(number<2){
			return false;
			}
		for(int i=2;i<number;i++){
			
			if(number%i==0){
				return false;
			}
		}
		return true;
	}	
		public static int isSum(int number){
			int sum=0;
			
			while(number>0){
				
				int digit=number%10;
				 sum = sum+digit;
				number =number/10;
				
			}
			return sum;
		}
}