package CollegeProgram;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int flag=0;
            System.out.print("Enter Number : ");
            int n = sc.nextInt();

            for(int i=2; i<n; i++) {
                if(n % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 1) {
                System.out.print("Your Number is not Prime");
            }
            else {
                System.out.print("Your Number is Prime");
            }
        }
        System.out.println();
    }
}
