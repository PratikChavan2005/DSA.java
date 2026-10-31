import java.util.*;
class TwoOccurenceHashMap{
	

	public static void main(String[] args){
	
		String s ="bcbbbcba";
		//String s="aaaa";
		int max=0;
		HashMap<Character,Integer> map=new HashMap<>();
		int left=0;
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			
			map.put(ch,map.getOrDefault(ch,0)+1);
			
			while(left<s.length()){
			
				if(map.get(ch)>2){
				
					char chleft=s.charAt(left);
					map.put(chleft,map.get(chleft)-1);
					left++;
				}
			}
			max=Math.max(max,i-left);
		}
		System.out.println(max);
	}	
}