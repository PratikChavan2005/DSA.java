class Program10{

  public static void main(String[]args){
     int start=1;
    for(int i=0;i<=5;i++){
          if(i%2==0){ start=1;}
          else{ start=0;}
        for(int j=0;j<i;j++){
        start=1-start;
         System.out.print(start);
          }
       System.out.println();
   }
 }
}