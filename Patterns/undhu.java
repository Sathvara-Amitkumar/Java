package Patterns;

import java.util.Scanner;

public class undhu {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            {
                System.out.print("Enter nno : ");
                int n = sc.nextInt();

                for(int i=n; i>=1; --i) {
                    for(int j=1; j<=i; j++) {
                        System.out.print(j);
                    }
                    System.out.println();
                }
            }
        }
    }
}
