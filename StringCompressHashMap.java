import java.util.*;
import java.util.HashMap;
class StringProblem1{	
    public static void main(String[]args){
	String s="LLLVVPP";
	HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<s.length();i++){	
		char ch=s.charAt(i);
		 int count=1;
			if(map.containsKey(ch)){
				map.put(ch,map.get(ch)+1);
			}
			else{	
			map.put(ch,1);
			}
		}
		char ch=map.toString(map);
	System.out.print(ch);
	}	
}