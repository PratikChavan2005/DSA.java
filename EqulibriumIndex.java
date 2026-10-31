import java.util.*;
class EqulibriumIndex{
	
	public static void main(String[] args){
	
		HashMap<Character,Integer> map=new HashMap<>();
		String s="abac";
		int[] arr=new int[s.length()];
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			int count=0;
			if(!map.containsKey(ch)){
				count++;
				map.put(ch,count);
			}
		arr[i]=count;
			
		}
		int total=0;
		for(int x:arr){
		total+=x;
		}
		int leftsum=0;
		for(int i=0;i<arr.length;i++){
			
			int rightsum=total-leftsum-arr[i];
			
			if(leftsum==rightsum){
				System.out.println(i);
				return ;
			}
			leftsum+=arr[i];
			
			
		}
	}	
}