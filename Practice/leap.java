package Practice;

import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Year : ");
            int year = sc.nextInt();
            if(year % 4 == 0) {
                System.out.println("Leap Year");
            }
            else {
                System.out.println("Not Leap year");
            }
        }
    }
}
