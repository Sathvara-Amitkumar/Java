package Practice;

import java.util.Scanner;

public class sumalldigit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter any Number :  ");
            int  n = sc.nextInt();
            int sum = 0;
            while(n > 0) {
                sum += n % 10;
                n /= 10;
            }
            System.out.print("Sum of all Digit = " + sum);
        }
        System.out.println();
    }
}