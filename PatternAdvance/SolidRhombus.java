package PatternAdvance;

import java.util.Scanner;

public class SolidRhombus {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++) {
            //Spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            for(int j=1; j<=n; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }
}
