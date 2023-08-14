package Practice;

import java.util.Scanner;

public class tablesum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter which No of Table : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=10; i++) {
            System.out.println(n + " X " + i + " = " + n*i);
            sum += (n*i);
        }
        System.out.println("-----------");
        System.out.println("S U M = " + sum);
    }
}
