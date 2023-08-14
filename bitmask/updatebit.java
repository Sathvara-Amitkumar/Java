package bitmask;

import java.util.Scanner;

public class updatebit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int oper = sc.nextInt();

            int n = 5;
            int pos = 1;

            int bitMask = 1<<pos;
            if(oper == 1) {
                //set
                int newnumber = bitMask | n;
                System.out.println(newnumber);
            }
            else {
                //clear
                int notbitMask = ~(bitMask);
                int newnumber = notbitMask & n;
                System.out.println(newnumber);
            }
        }
    }
}
