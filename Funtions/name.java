package Funtions;

import java.util.Scanner;

public class name {
    public static void printMyName(String name) {
        System.out.println("Hello " + name + "😊");
        return;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Your Name : ");
            String name = sc.nextLine();

            printMyName(name);
        }
    }
}
