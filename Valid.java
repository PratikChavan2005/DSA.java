class Valid{
	public static void main(String[] args)	{
		String Str="***##";
		
		int s=0;
		int h=0;
		for(int i=0;i<Str.length();i++){
			if(Str.charAt(i)=='*'){
				s++;
			}
			else {
				h++;
			}
		}
		if(s>h){
			System.out.println((s-h));
		}else if(h>s){
			System.out.println((s-h));
		}else {
			System.out.println("0");
		}
	}
}