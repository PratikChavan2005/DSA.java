import java.util.*;
class StringDemo{
	public static void main(String[]args){
		String s= "LLLVVPP";
		char[] arr=s.toCharArray();
			int i=0;
			while(i<arr.length){
			int j=i+1;
			int count=1;
			while(j<arr.length && arr[i]==arr[j]){
				
				count++;
				j++;
				
			}
		
		
			System.out.print(arr[i]+""+count);
			i=j;
		
		}
	}	
}