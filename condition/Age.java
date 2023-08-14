import java.util.*;

public class Age {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int age = sc.nextInt();

            if (age > 18) {
                System.out.println("Adult\nYou can vote\nYou can drive");
            }
            else if (age < 18 && age > 12 ) {
                System.out.println("Teenager");
            }
            else {
                System.out.println("Children");
            }

        }

    }
}
