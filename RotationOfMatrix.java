class RotationOfMatrix{
	
	
	public static void main(String[]args){
	
	//rotation works on only squere matrix 
		int[][] arr={{1,2,3},
				{5,6,7},
				{9,10,11}};
			
			int m=arr.length;
			int n=arr[0].length;
			
			// transpose
			for(int i=0;i<m;i++){
				
				for(int j=i+1;j<m;j++){
					
					int temp=arr[i][j];
					arr[i][j]=arr[j][i];
					arr[j][i]=temp;
				
				}
			
		        }
			
			// reverse the row 
		
			for(int i=0;i<m;i++){
			
				int left=0;

				int right=n-1;
				
				while(left<right){
				
				
					int temp=arr[i][left];
							
					arr[i][left]=arr[i][right];
						
					arr[i][right]=temp;

					left++;
					right--;
				}
			    
			}
			 for(int i=0;i<m;i++){
				
					for(int j=0;j<m;j++){
						
						System.out.print(arr[i][j] + "");
					}
				System.out.println();
				}
			
	}
	
	
}