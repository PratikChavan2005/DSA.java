class StringMethods{
	
	public static void main(String[]args){
	
		String s="LLLVVPP";
		char[] arr=s.toCharArray();
		
		int left=0;
		int right=left+1;
		int count=1;
		while(right<arr.length){
			
			if(arr[left]==arr[right]){
				
				count++;
				
				}
				else {
				System.out.print(arr[left] + "" + count);
					left=right;
					count=1;
				}
				
				right++;
			
			
			
		}
		System.out.print(arr[left] + "" + count);	
	}
	
}