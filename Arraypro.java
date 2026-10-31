import java.util.*;
class ArrayPro{
 public static void main(String[]args){
		int [] arr={-12,11,-13,-5,6,-7,5,-3,-6};
              int j=0;
for(int i=0;i<=arr.length-1;i++){
 
 	while(arr[i]<0 && arr[j]>0){
          int a=arr[i];
	  arr[i]=arr[j];
	  arr[j]=a;	
		}
	if(arr[j]<0){
          j++;
}
}
for(int e:arr){
System.out.println(e);
}
         

 

}
 }
	
