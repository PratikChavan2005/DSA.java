class ParkingSlot{
	
	public static void main(String[]args){
	
		int[][] arr={{0,1,0},{1,1,0},{1,0,0}};
		
		int max=0;
		int R=arr.length;
		int C=arr[0].length;
		int index=-1;
		for(int i=0;i<R;i++){
		
			int count=0;
			for(int j=0;j<C;j++){
				
				if(arr[i][j]==1){
				count++;
				}
			}
			if(count>max){
			max=count;
			index=i+1;
			}
		}
		System.out.println(index);
	}	
}