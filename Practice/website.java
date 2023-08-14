package Practice;

import java.util.Scanner;

public class website {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter String : ");
            String wes = sc.next();
            if(wes.endsWith(".com")) {
                System.out.println("Commercial Website");
            }
            else if(wes.endsWith(".org")) {
                System.out.println("Organization Website");
            }
            else if(wes.endsWith(".in")) {
                System.out.println("Indian Website");
            }
            else {
                System.out.println("Invalid Domain / Website");
            }
        }
    }
}