import java.util.*;
class PaintHouse {

    public static void main(String[] args) {

        int[][] arr = {
            {1,5,3},
            {2,9,4},
            {3,1,7}
        };
	int NH=5;
	int NC=2;
	int Budget=20;
        int n = arr[0].length;

        
        int Min = arr[0][0];
        for (int j = 1; j < n; j++) {
            Min = Math.min(Min, arr[0][j]);
        }
        
        
        int Min1 = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            if (j == 0)
                continue;

            Min1 = Math.min(Min1, arr[1][j]);
        }
       

        
        int Min2 = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            if (j == 0 || j == 2)
                continue;

            Min2 = Math.min(Min2, arr[2][j]);
        }
        
		if(NC>=(NH/2)){
		
		int sum=Min+Min1+Min2;
			if(sum<Budget){
			
				System.out.println("the minimum cost for to paint" + " " + sum);
			
				}
		
			else {System.out.println("-1");}
		
		}
		else {System.out.println("-1");
              }
    }
}