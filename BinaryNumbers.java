 class BinaryNumbers{
public static void Binarynumbers(int x){
  int start;
    for(int i=0;i<=x;i++){

        if(i%2==0){

             start=1;
            
         }
         else {
                start=0;
            }
      for(int j=0;j<=i;j++){
               
               start = 1-start;
         
            System.out.print(start);
            
      }
      System.out.println();
    }
   }
    public static void main(String[] args){
         
            p11(5);
    }
}