import java.util.*;
import java.util.Arrays;
class RankOfArray{
	public static void main(String[]args){
	
		HashMap<Integer,Integer> rank=new HashMap<>();
		int[] arr={25,15,8,2,10,3,12};
		int[] sorted=arr.clone();
		
		Arrays.sort(sorted);
		
		for(int i=0;i<arr.length;i++){
		rank.put(sorted[i],i+1);
		}
		for(int num:arr)
		System.out.println(num + "->" + rank.get(num));
		
	}
	
}