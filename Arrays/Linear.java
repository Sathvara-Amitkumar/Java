// Take an arrays  as input from the user ,search for a given number x 
// and print the index at which it occurs.
package Arrays;

import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter  Size of Array : ");
            int size = sc.nextInt();
            int[] numbers = new int[size];

            //input
            for(int i=0; i<size; i++) {
                numbers[i] = sc.nextInt();
            }
            //Search input
            int x = sc.nextInt();
            
            //output
            for(int i=0; i<numbers.length; i++) {
                if(numbers[i] == x) {
                    System.out.println("X found at index : " + i);
                }
                else {
                    System.out.println("Invalid Value");
                }
            }
            System.out.println();
        }
    }
}