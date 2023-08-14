package Operators;

public class increment {
    public static void main(String[] args) {
        //Pre Increment
        int a = 10;
        int b = 0;

        b = ++a;
        System.out.println(a);
        System.out.println(b);

        //Post Increment
        int c = 10;
        int d = 0;

        d = c++;
        System.out.println(c);
        System.out.println(d);
    }
}
