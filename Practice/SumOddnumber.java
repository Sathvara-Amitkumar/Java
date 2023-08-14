package Practice;

import java.util.Scanner;

public class SumOddnumber {
    public static void main(String[] args) {
        int sum = 0;
        try (Scanner sc = new Scanner(System.in)) {
            {
                System.out.print("Enter Limit of Number : ");
                int n = sc.nextInt();

                for(int i=1; i<=n; i+=2) {
                    sum +=i;
                }
                System.out.println("Sum of ODD number = " + sum);
            }
        }
    }
}
