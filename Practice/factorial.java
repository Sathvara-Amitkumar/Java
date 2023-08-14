//factorial number
package Practice;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            {
                System.out.print("Enter Any Number : ");
                int n = sc.nextInt();

                int fact = 1;
                for(int i=1; i<=n; i++) {
                    fact *= i; 
                }
                System.out.println("Factorial = " + fact);
            }
        }
    }
}
