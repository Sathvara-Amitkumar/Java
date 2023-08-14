package Practice;

import java.util.Scanner;

public class Reversenumber {
    public static void main(String[] args) {
        int rev = 0;

        try (Scanner sc = new Scanner(System.in)) {
            {
                System.out.print("Enter the Number : ");
                int n = sc.nextInt();
                // Inside Loop
                System.out.print("Reverse Number : ");

                while(n > 0) {
                    rev = n % 10;
                    System.out.print(rev);
                    n /= 10;
                }
                
                //Outside Loop
                // while(n > 0) {
                //     rev *= 10;
                //     rev += n % 10;
                //     n /= 10;
                // }
                // System.out.println("Reverse Number : " + rev);
            }
        }    
    }
}
