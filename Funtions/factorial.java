package Funtions;

import java.util.Scanner;

public class factorial {
    public static void printFactorial(int n) {
        //codition
        if( n < 0) {
            System.out.println("Invalid Number");
            return;
        }
        // Loop
        int factorial = 1;
        for(int i=n; i>=1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter No of Factorial : ");
            int n = sc.nextInt();

            printFactorial(n);
        }
    }
}