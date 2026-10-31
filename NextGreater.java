import java.util.*;
class NextGreater{
	
	public static void main(String[]args){
	
		int[] arr={2,8,6,9,2,1};
		int n=arr.length;
		int max=arr[n-1];
		int count=1;
		ArrayList<Integer> list=new ArrayList<>();
		list.add(max);
		for(int i=n-2;i>=0;i--){
			
			if(arr[i]>=max){
			
			list.add(arr[i]);
			max=arr[i];
			count++;
			}
		}
		System.out.println(count);
	}	
}