
import java.util.Scanner;
class AssendingOrder{
    public static void main(String[]args){
     
 	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();

int[] arr=new int[n];
int sorted[]=new int[n];
n=arr.length;
System.out.println("the element is");
for( int i=0;i<=arr.length-1;i++){
	
    arr[i]=sc.nextInt();
		
    }
for(int i=0;i<=arr.length-1;i++){System.out.println("the array is "+arr[i]);}

for(int i=n-1;i>=0;i--){
  	for(int j=1;j<=i;j++){
	 while(arr[i]>arr[j]){
        	int temp=arr[i];
		arr[j]=arr[i];
		arr[j]=temp;
		}
	}
  }
 for(int j:sorted){
 System.out.println(j);
}
 
}
}




