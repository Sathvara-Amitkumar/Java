package Arrays;

import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Size of Array : ");
            int size = sc.nextInt();
            int[] numbers = new int[size];

            for(int i=0; i<size; i++){
                numbers[i] = sc.nextInt();
            }
            int min = Integer.MIN_VALUE;      
            int max = Integer.MAX_VALUE;      

            for(int i=0; i<numbers.length; i++) {
                if(numbers[i] < min) {
                    min = numbers[i];
                }
                if(numbers[i] > max) {
                    max = numbers[i];
                }
            }
            System.out.println("Largest number is:" + max);
            System.out.println("Smallest number is:" + min);
        }
    }
}
