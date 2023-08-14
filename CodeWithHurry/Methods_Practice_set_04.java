package CodeWithHurry;

import java.util.Scanner;

//Find fibonacci series nTH term
public class Methods_Practice_set_04 {
    static int fib(int n) {
        if(n == 0) {
            return 0;
        }
        else if (n == 1){
            return 1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of term to print Fibonacci Series : ");
        int n= sc.nextInt();
        for(int i=0; i<n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
