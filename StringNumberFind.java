class StringNumberFind{	
	public static void main(String[]args){ 
		 String Str= "hello this is alpha 5051 and 9475"; 
		//String Str="hello pratik"; 
		int max=0;  
		int number=0;   
		for(int i=0;i<Str.length();i++){     	
			int n=Str.charAt(i)-'0';  
			if(n>=0 && n<=8){      	
				 number=(number*10)+n;
				max=Math.max(number,max);	
			}
			else{ 	
			 number=0;	
			}
		 }
		System.out.println(max);   
	}	
}