package Arrays;

import java.util.Scanner;

public class twodsearch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Rows : ");
            int rows = sc.nextInt();
            System.out.print("Enter Cols : ");
            int cols = sc.nextInt();

            int[][] numbers = new int[rows][cols];
            // input
            //rows
            for(int i=0; i<rows; i++) {
                for(int j=0; j<cols; j++) {
                    numbers[i][j] = sc.nextInt();
                }
            }

            int x = sc.nextInt();

            //output
            for(int i=0; i<rows; i++) {
                for(int j=0; j<cols; j++) {
                    if(numbers[i][j] == x) {
                        System.out.println("x found at location:(" + i + " , " + j + ")");
                    }
                }
            }
        }
    }
}
