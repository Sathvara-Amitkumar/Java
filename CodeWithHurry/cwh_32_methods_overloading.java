package CodeWithHurry;

public class cwh_32_methods_overloading {
    static void foo(int n) {
        System.out.println("Good Morning " + n + " bro");
    }
    static void foo(int n, int x) {
        System.out.println("Good Morning " + n + " bro");
        System.out.println("Good Morning " + x + " bro");
    }
    public static void main(String[] args) {
        foo(5);
        foo(4,3);
    }
}
