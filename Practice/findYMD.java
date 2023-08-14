package Practice;

import java.util.Scanner;

public class findYMD {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Number of Days :  ");
            int  x = sc.nextInt();
            int y,m,d;
            y = x / 365;
            d = x % 365;
            m = d / 30;
            d = d % 30;
            System.out.println(y + " Years");
            System.out.println(m + " Months");
            System.out.print(d + " Days");  
        }
    }
}