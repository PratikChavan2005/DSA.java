class MaxRectangle{
	
	public static boolean isAllOnes(char[][] mat,int r1,int r2 , int c1, int c2){
	
		
		for(int i=r1;i<=r2;i++){

			for(int j=c1;j<=c2;j++){
				if(mat[i][j]=='0'){
					return false ;
				}
			}
		}
		return true ;	
	}
	public static void main(String[] args){
	
			char[][] matrix = {
    {'1', '0', '1', '0', '0'},
    {'1', '0', '1', '1', '1'},
    {'1', '1', '1', '1', '1'},
    {'1', '0', '0', '1', '0'}
    };
	
		int row=matrix.length;
		int col=matrix[0].length;
		int max=0;
		
		for(int r1=0;r1<row;r1++){
			for(int c1=0;c1<col;c1++){
			
				if(matrix[r1][c1]=='0') continue;
				
				for(int r2=r1;r2<row;r2++){
					for(int c2=c1;c2<col;c2++){
						if(isAllOnes(matrix,r1,r2,c1,c2)){
							int area=(r2-r1+1)*(c2-c1+1);
							max=Math.max(max,area);
						}
					}
				}
			}
		}
		System.out.println(max);
	
	}	
	
}