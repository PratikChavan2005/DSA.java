import java.util.*;
class LongestSubStringOptimal{
	
	public static void main(String[] args){
	
		String s="abccdebaab";
		
		int max=0;
		int left=0;
		HashMap<Character,Integer> map=new HashMap<>();
		for(int right=0;right<s.length();right++){
		
			char ch = s.charAt(right);
			if(map.containsKey(ch)){
			
				left=Math.max(left,map.get(ch)+1);
			}
			
			map.put(ch,right);
			max=Math.max(max,right-left+1);
		}
		System.out.println(max);
	}	
}