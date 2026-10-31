class OppositefaceTriangle{
public static void p13(int x){

        for(int i=0;i<=x;i++){

            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            
            for(int j=0;j<=2*x-(2*i+1);j++){
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
         
            p13(5);
    }
}