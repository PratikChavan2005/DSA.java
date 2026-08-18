class PerfectSquere{

		public static void main(String[] args){
		
			String s="aaabbbccc";
			int n=(int)Math.sqrt(s.length());	
			System.out.println(n);
			char[][] matrix=new char[n][n];
			int k=0;
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					matrix[i][j]=s.charAt(k++);
				}
			}
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					System.out.print(matrix[i][j]);
				}
				System.out.println();
			}
			//row count check.
			int total=0;
			for(int i=0;i<n;i++){
				int count=0;
				
				for(int j=1;j<n;j++){
					if(matrix[i][j]==matrix[i][j-1]){
						count++;
					}
					if(count==n-1){
						total++;	
					}
				}
			}
			//col count check
			for(int j=0;j<n;j++){
				int count=0;
				
				for(int i=1;i<n;i++){
					if(matrix[i][j]==matrix[i-1][j]){
						count++;
					}
					if(count==n-1){
						total++;	
					}
				}
			}
			System.out.println(total);
			
			
			
	}
		
}