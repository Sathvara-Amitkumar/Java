package Arrays;

import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Size of Array : ");
            int size = sc.nextInt();
            // array
            int[] numbers = new int[size];

            // input
            for(int i=0; i<size; i++) {
                numbers[i] = sc.nextInt();
            }
            //output
            for(int i=0; i<size; i++) {
                System.out.println(numbers[i]);
            }
        }
        
    }
}
