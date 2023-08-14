package CodeWithHurry;
//Convert Celcius to Fahrenhit
import java.util.Scanner;

public class Methods_Practice_set_08 {
    static float celtoFahren(int n) {
            float x = (n * ((float) 9 / 5)) + 32;
            return x;
    }
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Celcius : ");
        int n = sc.nextInt();
        System.out.println("Fahrenheit : " + celtoFahren(n));
        }
    }
