import java.util.Scanner;

class AreaOfCircle {
    public static void main(String[] args) {
        int r;
        double pi = 3.14, area;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the radius:");
        r = s.nextInt();
        
        area = pi * r * r;
        System.out.println("The area of the circle is: " + area);
        
        s.close(); 
   
  }
}
