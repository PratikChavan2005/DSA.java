public class ShoePair{
	
	public static void main(String[]args){
	
	   String[] arr={"7L","8L","8R","6R","7R","6R","6L","7L"};
		
				int count=0;
		for(int i=0;i<arr.length;i++){	
		
			int index=check(arr,arr[i]);


				if(index!=-1){
				count++;
				}
				
		}
		System.out.println(count);
	}
		
		public static int check(String[] nums,String s){
		
			for(int i=0;i<nums.length;i++){
				
				if(nums[i]!="0" && nums[i].charAt(0)==s.charAt(0) && !nums[i].equals(s)){
						
					nums[i]="0";
					return i;
				}
			}
			return -1;
		}
		
}