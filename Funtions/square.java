package Funtions;

import java.util.Scanner;

public class square {
    public static int calculatesquare(int a) {
        int square = a*a;
        return square;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            

            int square = (calculatesquare(a));
            System.out.println(square);
        }

    }
}
