import java.util.*;
import java.util.HashMap;
class MaxArray{
	
	public static void main(String[]args){
	
		HashMap<Integer,Integer> map=new HashMap<>();
		int[] arr={1,4,5,7,8,9,9,9};
		int k=3;
		int sum=0;
		int max=0;
		
		for(int i=0;i<k;i++){
			sum=sum+arr[i];
			map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		}
		if(map.size()==k){
		  max=sum;
		}
		for(int i=k;i<arr.length;i++){
		
			int remove=arr[i-k];
			sum=sum-remove;
			
			map.put(remove,map.get(remove)-1);
			
				if(map.get(remove)==0){
					map.remove(remove);
				}

			int add=arr[i];
			sum=sum+add;
		
			map.put(add, map.getOrDefault(add,0)+1);
				
			if(map.size()==k){
				max=Math.max(max,sum);
			}
		}
	System.out.println(max);

	}
}