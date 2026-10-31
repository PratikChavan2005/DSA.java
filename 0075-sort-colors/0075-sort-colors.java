class Solution {
    public void sortColors(int[] arr) {
    int countzero = 0;
    int countone = 0;
    int counttwo = 0;
    
       for( int i=0;i<arr.length;i++){
        if(arr[i]==0){
            countzero++;
        }
        else if(arr[i]==1){
            countone++;
        }
        else {
            counttwo++;
        }
       }
      int i=0;
       while(countzero>0){
        
        arr[i]=0;
        i++;
        countzero--;
       }
       while(countone>0){
        
        arr[i]=1;
        i++;
        countone--;
       }
       while(counttwo>0){
        
        
        arr[i]=2;
        i++;
        counttwo--;
       
       }
       }
     
    }
