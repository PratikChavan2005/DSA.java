import java.util.*;
import java.util.Arrays;
class DateTime{
	public static void main(String[]args){
		String Str="7:05:45PM";
		
			if(Str.contains("P")){
				
				String s=Str.split(":")[0];
				int a=Integer.parseInt(s);
				
				a=a+12;
				
				String s1=Str.split(":")[1];
				String s2=Str.split(":")[2];
				System.out.println(a + ":" + s1 + ":" + s2 );
			}else {
				System.out.println(Str);
			}
			
		
	}	
	
}