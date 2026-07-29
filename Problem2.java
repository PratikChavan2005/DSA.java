class Problem2{
	
	public static void main(String[] args){
	
		int[][] arr={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		
		int m=arr.length;
		int n=arr[0].length;
		int target=55;
		boolean found=false;
		for(int i=0;i<m;i++){
		
			for(int j=0;j<n;j++){
			
				if(arr[i][j]==target){
					System.out.println("key found " + arr[i][j] + "true");
					found = true;
					return ;
				} else { found = false ;
					}
			}
			
		}
			if(found){
			
			}
			else {
			System.out.println("false ");
			}
	}	
}