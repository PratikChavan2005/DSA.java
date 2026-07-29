class Problem4{
	
	public static void main(String[] args){
	
		int[] arr={2,6,-3,9,12,25};
		
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++){
		
			if(arr[i]<min){
			min=arr[i];
			}
		}
		System.out.println("the min number" + "->" + min);
		
	}	
}