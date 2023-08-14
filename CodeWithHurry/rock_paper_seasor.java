package CodeWithHurry;
import java.util.*;

public class rock_paper_seasor {
    public static void main(String[] args) {
        System.out.println("Welcome to the Rock-Paper-Seasor GAME");

        Scanner sc = new Scanner(System.in);
        System.out.print("Press Start for [ Y ] : ");
        String ch = sc.nextLine();
            if (ch.equals("Y") || ch.equals("y")) {
                System.out.println("Let's, Start the Game");
                System.out.println("Press Button,\n\t1 -> ROCK\n\t2 -> PAPER\n\t3 -> SEASOR");
                int n = 5;
                int comp = 0;
                int you = 0;
                int i = 1;
                while (i <= n) {
                    System.out.println("[  Round No - " + i + " ]");
                    Random rand = new Random();
                    int random = rand.nextInt(1, 4);
                    System.out.println("Computer Random Numbers : " + random);

                    System.out.print("Enter User Random Number : ");
                    int user = sc.nextInt();

                    switch (random) {
                        case 1 -> System.out.println("Computer Choose Rock");
                        case 2 -> System.out.println("Computer Choose Paper");
                        case 3 -> System.out.println("Computer Choose Seasor");
                    }

                    switch (user) {
                        case 1 -> System.out.println("User Choose Rock");
                        case 2 -> System.out.println("User Choose Paper");
                        case 3 -> System.out.println("User Choose Seasor");
                        default -> System.out.println("Please input Valid Number");
                    }

                    if (user == 1 && random == 1) {
                        System.out.println("Game is TIE");
                    } else if (user == 2 && random == 2) {
                        System.out.println("Game is TIE");
                    } else if (user == 3 && random == 3) {
                        System.out.println("Game is TIE");
                    } else if (user == 1 && random == 2) {
                        System.out.println("You Lose the Game");
                        comp++;
                    } else if (user == 1 && random == 3) {
                        System.out.println("You WON the Game");
                        you++;
                    } else if (user == 2 && random == 1) {
                        System.out.println("You WON the Game");
                        you++;
                    } else if (user == 2 && random == 3) {
                        System.out.println("You Lose the Game");
                        comp++;
                    } else if (user == 3 && random == 1) {
                        System.out.println("You Lose the Game");
                        comp++;
                    } else if (user == 3 && random == 2) {
                        System.out.println("You WON the Game");
                        you++;
                    }
                    System.out.println("\n");
                    i++;
                }
                System.out.println(you);
                System.out.println(comp);

                if (you > comp) {
                    System.out.println("You are WINNER for this Game");
                } else if (you == comp) {
                    System.out.println("Game is TIE");
                } else {
                    System.out.println("Computer are WINNER for this Game");
                }
            } else {
                System.out.println("Invalid Input : Please, Press Y for Start the GAME");
            }
    }
}
