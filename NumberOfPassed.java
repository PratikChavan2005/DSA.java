class NumberOfPassed{
	
	public static void main(String[]args){
		
		int[][] arr={{60,70,80},{40,50,60},{30,40,50}};
		int count=0;
		int passing =50;
			
		int M=arr.length;
		int N=arr[0].length;
		
			for(int i=0;i<M;i++){
				
				int sum=0;
				for(int j=0;j<N;j++){
				
					sum=sum+arr[i][j];
				}
				
			int passcount=0;
			double avg= (double)sum/M;
			if(avg>50){
				passcount++;
				System.out.println(passcount);
				}
			
			}
		
		
	}	
}