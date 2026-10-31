import java.util.*;
class ABC{
   public static void main(String[]args){
      
    int[] arr={20,15,26,2,98,6};
    int[] sorted=new int[arr.length];

for(int i=0;i<=arr.length-1;i++){
	sorted[i]=arr[i];
	}

  for(int i=0;i<=arr.length-1;i++){
      
	 for(int j=i+1;j<=arr.length-1;j++){
    
               if(arr[i]>arr[j]){
		int a=arr[i];
		arr[i]=arr[j];
		arr[j]=a;
			}
 		}

}
for(int i=0;i<=arr.length-1;i++){System.out.println(arr[i]);}

    for(int i=0;i<=arr.length-1;i++){
		for(int j=0;j<=arr.length-1;j++){
                 if(sorted[i]==arr[j]){
    System.out.println("the rank of "+sorted[i]+" is ->"+ (j+1));
          }
 			}
		}
	}


}