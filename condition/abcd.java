import java.util.Scanner;

public class abcd {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            {
                System.out.print("Enter Character or Value :  ");
                int ch = sc.nextInt();

                if(ch >= 'a' && ch <= 'z') {
                    System.out.print("Enter Value is Lower");
                }
                else if(ch >= 'A' && ch <= 'Z') {
                    System.out.print("Enter value is UPPER");
                }
                else if(ch >= '1' && ch <= '9') {
                    System.out.print("Enter Value is Numerical");
                }
                else {
                    System.out.print("Invalid value");
                }
                System.out.println();
            }
        }
    }
}
