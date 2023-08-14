package Operators;

public class Decrement {
    public static void main(String[] args) {
        //Pre Decrement
        int a = 10;
        int b = 0;

        b = --a;
        System.out.println(a);
        System.out.println(b);

        //Post Decrement
        int c = 10;
        int d = 0;

        d = c--;
        System.out.println(c);
        System.out.println(d);
    }
}
