import java.util.Arrays;
class BinarySearch{
	public static int binarySearch(int[] nums,int target){
		Arrays.sort(nums);
		int low=0;
		int high=nums.length-1;
		while(low<=high){
		    int mid=low+(high-low)/2;
			if(nums[mid]==target){
				return mid;
			}
			else if (nums[mid] < target){
				low=mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return -1;	
	}
	
		public static void main(String[] args){
			int[] nums={1,10,2,4,5,6,7,13,9,14,11,12,3};
			int target=11;
			int index=binarySearch(nums,target);
			if(index!=-1){
				System.out.println("Found" + "Index "  + "->" + index + "->" + nums[index]);
			} else {
				System.out.println("Not found ");
			}
		}
		
}