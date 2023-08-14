package CollegeProgram;

import java.util.Scanner;

public class votingCondition {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter You Age : ");
            int n = sc.nextInt();

            if(n < 18) {
                System.out.println("You are not eligible to vote");
                System.out.print("wait for " + (18-n) + " more years...");
            }
            else if(n >= 18) {
                System.out.print("You are eligible for VOTING");
            }
            else {
                System.out.println("E R R O R...404");
            }
        }
        System.out.println();
    }
}
