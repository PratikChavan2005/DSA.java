import java.util.*;
class BinarySearchRecurssive{
	public static void main(String[]args){
	
		int[] nums = {2,42,6,8,7,3,1,7};
		Arrays.sort(nums);
		int target=3;
		int key=check(nums,0,nums.length-1,target);
		System.out.println(key);
	}	
	public static int check(int[] nums,int left,int right,int target){
		if(left>right){
			return -1;
		}
		int mid = left+(right-left)/2;
		
		if(nums[mid]==target){
			return mid;	
		}
		else if(nums[mid]<target){
			return check(nums,mid+1,right,target);
		}
		else {
			return check(nums,left,mid-1,target);
		}
			
	}
}