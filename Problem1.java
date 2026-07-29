class Problem1{
	
	public static void main(String[] args){
	
		String s="##***";
		
		int star=0;
		int hash=0;
		char[] arr=s.toCharArray();
		for(int i=0;i<arr.length;i++){
	
			if(arr[i]=='#'){
			
				hash++;
			}
			else {
				
				star++;
			}
		}
		
		if(star>hash){
			System.out.println("positive integer");
		}
		else if (hash > star){
		
			System.out.println("Negative number");
		}
		else {
			System.out.println("the number of * and # are equal");	
		}
	}	
}