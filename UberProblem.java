class UberProblem{
	public static void main(String[]args){
		int budget=30;
        	int[] PK={10,5};
		int[] PC={12,5};
     	 	int MaxKm=0;
       for(int i=0;i<PC.length;i++){
		int n=budget/PC[i];
              int ride=n*PK[i];
		  //MaxKm=Math.max(ride,MaxKm);
		if(ride>MaxKm){
		MaxKm=ride;
		}

         }
  
                
  System.out.println(MaxKm);	 
		
	}

}	