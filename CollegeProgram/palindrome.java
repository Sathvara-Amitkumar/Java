package CollegeProgram;

import java.util.Scanner;

public class palindrome {
    public static void printPalindrome(int n) {
        int temp,rev=0;
        temp = n;
        while(n > 0) {
            rev = rev * 10;
            rev += n % 10;
            n /= 10;
        }
        //Condition
        if(temp == rev) {
            System.out.print("Number is Palindrome");
        }
        else {
            System.out.print("Number is not Palindrome");
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter any Number :  ");
            int  n = sc.nextInt();

            printPalindrome(n);
        }
    }
}
