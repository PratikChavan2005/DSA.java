class LongestSubString{
	
	public static void main(String[] args){
		
		String s="abccbabcd";

		int max=0;
		
		for(int i=0;i<s.length();i++){
			
			int[] freq=new int[256];
			
			for(int j=i;j<s.length();j++){
				char ch=s.charAt(j);   
				
				if(freq[ch]==1){
					break;
				}
			freq[ch]++;
			max=Math.max(max,j-i+1);
					
			}
			
		}
		System.out.println(max);
		
	
	}
}