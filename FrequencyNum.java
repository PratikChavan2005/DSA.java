import java.util.*;
import java.util.HashMap;
class FrequencyNum{
	public static void main(String[]args){    
		int[] arr={2,7,2,5,7,1,2,6,2};    
		HashMap<Integer,Integer> map=new HashMap<>();   
		
		for(int num:arr){   
			int count=0;
				map.put(num, map.getOrDefault(num,0)+1);	
		}
		for(Integer key:map.keySet()){
			if(map.get(key)>=(arr.length/2)){
			System.out.println(key + "->" + map.get(key));
			break;
			}
		else {
		System.out.println("no element ");
		}
	     }		
		
	}
}