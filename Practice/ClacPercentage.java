package Practice;

import java.util.Scanner;

public class ClacPercentage {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            {
                System.out.print("Enter Your Exam Marks : ");
                float n = sc.nextInt();

                System.out.print("Enter Number of Total Subject : ");
                float s = sc.nextInt();

                float per = (n * 100) / (s * 100) ;
                System.out.print("Your Percentage is =  " + per + " %");
            }
        } 
        System.out.println();
    }
}
