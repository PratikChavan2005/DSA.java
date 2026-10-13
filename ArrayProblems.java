package org.example;

import java.util.Arrays;

public class ArrayProblems {
    public static void main(String[]args){
        int sum=0;

        int[] arr={3,2,8,2};
        int MinValue=arr[0];
        int SecondMaxValue=arr[0];
        int MaxValue=arr[0];
        for(int i=0;i<= arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){

                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }

        }
        for(int i=0;i< arr.length;i++){
            if(arr[i]<MinValue){
                MinValue=arr[i];
            }
        }
        for(int i=0;i< arr.length;i++){
            if(arr[i]>MaxValue){
                MaxValue=arr[i];
            }
        }
        System.out.println("The min value is"+MinValue);
for(int i=0;i< arr.length;i++){
    if(MaxValue>arr[i] && arr[i]>MinValue){
        SecondMaxValue=arr[i];
    }

}
        System.out.println("second large "+SecondMaxValue);
        for(int i=0;i<arr.length;i++){

            sum=sum+arr[i];
        }
         System.out.println(sum);
//        Arrays.sort(arr);
        System.out.println("The assending order is"+ Arrays.toString(arr));
        int index=Arrays.binarySearch(arr,2);
        System.out.println(index);
    }
}
