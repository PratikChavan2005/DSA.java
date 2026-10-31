class SetZeros{
	
	public static void main(String[] args){
	
	
		int[][] matrix={{1,1,1},{1,0,1},{1,1,1}};
		int n=matrix.length;
		int m=matrix[0].length;
		boolean[] row=new boolean[n];
		boolean[] col= new boolean[m];

		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(matrix[i][j]==0){
					row[i]=true;
					col[j]=true;
				}
			}
		}
		
		for(int i=0;i<n;i++){
			if(row[i]){
				for(int j=0;j<m;j++){
					matrix[i][j]=0;	
				}
			}	
		}
		
		for(int j=0;j<m;j++){
			if(col[j]){
				for(int i=0;i<n;i++){
					matrix[i][j]=0;
				}	
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}	
	
}