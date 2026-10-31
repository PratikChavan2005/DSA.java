import java.util.Scanner;

class Add1
{
  public static void main(String[]args)
	{
 	  int x,y,sum;
	   Scanner myobj = new Scanner(System.in);
		System.out.println("Enter 1st number");
		x=myobj.nextInt();
		System.out.println("Enter 2st number");
		y=myobj.nextInt();
			sum=x+y;
			System.out.println("sum is"+ sum);
	}
  
}