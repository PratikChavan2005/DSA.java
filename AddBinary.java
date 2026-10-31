import java.lang.StringBuilder;

class AddBinary{
	
	public static void main(String[]args){
		
		String s="11";
		String t="1";
		StringBuilder sb=new StringBuilder();
			
		int i=s.length()-1;
		int j=t.length()-1;
		
		int carry=0;
		
		while(i>=0 || j>=0 || carry!=0){
				int sum=carry;
			if(i>=0){
			sum=sum+s.charAt(i)-'0';
			i--;
			}	
			if(j>=0){
			sum=sum+t.charAt(j)-'0';
			j--;
			}
			
			sb.append(sum%2);
			carry=sum/2;
			
			
			
			
		}
		String Str=sb.reverse().toString();
		System.out.println(Str);
	}	
}