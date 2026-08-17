import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows for the top half: ");
        int n = s.nextInt(); // n controls the size of the diamond
        int i, j, space = 1;
        
        // --- Upper Half of the Diamond (Pyramid) ---
        space = n - 1;
        for (j = 1; j <= n; j++) {
            // Inner loop for printing spaces
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space--;
            // Inner loop for printing stars
            for (i = 1; i <= 2 * j - 1; i++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }

        // --- Lower Half of the Diamond (Inverted Pyramid) ---
        space = 1;
        for (j = 1; j <= n - 1; j++) {
            // Inner loop for printing spaces
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space++;
            // Inner loop for printing stars
            for (i = 1; i <= 2 * (n - j) - 1; i++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
        
        s.close();
    }
}
