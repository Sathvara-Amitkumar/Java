package CodeWithHurry;

import java.util.*;

public class randomnumbers {
    public static void main(String[] args) {
        Random rand = new Random();
        int random = rand.nextInt(1,4);
        System.out.println("random Numbers : " + random);
    }
}