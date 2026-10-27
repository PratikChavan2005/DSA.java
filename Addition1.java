
import java.util.Scanner;


class Addition1
{
  public static void main(String[] args)
  {
     int sum , mul;
      Scanner input = new Scanner(System.in);

      System.out.println("Enter 1st no :-");
         int x=input.nextInt();
      System.out.println("enter 2nd no :-");
         int y=input.nextInt();

      sum=x+y;
      System.out.println("The sum and multiply is " + sum);
  }

}         