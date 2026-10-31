import java.util.HashMap;
class UniqueCharacter{
	
	public static void main(String[] args){
	HashMap<Character,Integer> map=new HashMap<>();
		String s="leetcode";
		
		
		
		for(char ch:s.toCharArray()){
			map.put(ch,map.getOrDefault(ch,0)+1);	
		}
		
		for(int i=0;i<s.length();i++){
			if(map.get(s.charAt(i))==1){
				System.out.println(i);
				return ;
			}
		}
		
	}	
}