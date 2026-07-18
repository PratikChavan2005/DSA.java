class Amazon{
	public static void main(String[]args){
      
     int[] health={1,2,1,3};
     int[] arr=new int[health.length];
       
	

        int max=0;
	for(int start=0;start<arr.length;start++){
		
		for(int i=0;i<arr.length;i++){
			arr[i]=health[i];
			}
 
			int j=start;
		 while(true){	
		      if(arr[j]>max){
				max=arr[j];
			}
		     int x=arr[j];
       		for(int i=0;i<arr.length;i++){
			if(j!=i){
			arr[i]=arr[i]+1;
			}
     		    }
    		int pointer=-1;
    		for(int i=0;i<arr.length;i++){
			if(i!=j && arr[i]==x+1){
					pointer=i;
					break;
				}
			}
		if(pointer==-1){
		     break;
			}
		
                  
		
          j=pointer;
			
	}
   }

   
	System.out.println("the max health is " + max);	
       

	}
   
}