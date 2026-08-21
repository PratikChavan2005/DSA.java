
class OddElement{
         public static void main(String[]args){
	       int[] arr={2,2,3,1,1};  
		int j=0;
		int i=0;
		
	for( i=0;i<=arr.length-1;i++){
          for( j=i+1;j<=i-1;j++){
		 if(arr[i]==arr[j]){
			System.out.println("kugsfjsg");
			}
     		else if(arr[i]!=arr[j]){
		System.out.println("element is" + arr[j]);
			}
		else{
		System.out.println("Not element");
		}
		}
	}
		
		}
    

	}