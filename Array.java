import java.util.Scanner;
class Array{
 public static void main(String[]args){
 Scanner sc=new Scanner(System.in);
   
    System.out.println("enter size of array");
	int n=sc.nextInt();
int[] arr=new int[n];
    n=arr.length;
   System.out.println("Enter the array elements");
for(int i=0;i<arr.length;i++){
 arr[i]=sc.nextInt();
}
System.out.println("the array elements are");
for(int i =n-1;i>=0;i--){System.out.print(" " + arr[i]);}
}
 
}