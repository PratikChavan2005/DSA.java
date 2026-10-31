class Negative{ 
	public static void main(String[]args){
		//String s="LLLVVPP";
		char[] arr=s.toCharArray();
		int left=0;
		
		while(left<arr.length){ 
			int count=1;
			int right=left+1;
			while(right<arr.length && arr[left]==arr[right]){
				count++;
				right++;
			}
			
		
	      if(count>1)
			{
			 System.out.println(arr[left] + "" + count);
			
			}
		else {System.out.println(arr[left]);}
			 left=right;
		}	
            
	}
	
}