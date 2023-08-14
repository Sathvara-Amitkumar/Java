package Patterns;

import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Number of Pattern : ");
            int n = sc.nextInt();
            
            //outer loop
            for (int i=1; i<=n; i++) {
                //inner loop 
                for(int j=1; j<=i; j++) {
                    System.out.print("x" + " ");
                }
                System.out.println();
            }
        }
    }
}
