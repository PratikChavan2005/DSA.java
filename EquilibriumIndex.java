import java.util.*;
class EquilibriumIndex{
	
	public static void main(String[] args){
	
		HashMap<Character,Integer> map=new HashMap<>();
		String s="abac";
		int[] arr=new int[s.length()];
		int count=0;
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			
			if(!map.containsKey(ch)){
				count++;
				map.put(ch,count);
			}
		arr[i]=map.get(ch);
			//System.out.println(arr[i]);
		}
		int total=0;
		for(int x:arr){

		total+=x;
		
		}
		//System.out.println(total);
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