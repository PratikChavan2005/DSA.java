class ProductOfDigit{

	public static void main(String[] args){
		int n=15;
		int t=3;
		while(true){
				
			int temp=n;
			int pro=1;

			while(n>0){
				int rem = temp%10;
				pro=pro*rem;
				temp=temp/10;
			}
			if(pro%t==0){
				System.out.println(n);
			}
				
			n++;
		}
	}	
}