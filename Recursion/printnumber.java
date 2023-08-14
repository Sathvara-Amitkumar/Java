package Recursion;

public class printnumber {
    public static void printNumb(int n) {
        if(n == 11) {
            return;
        }
        System.out.println(n);
        printNumb(n+1);
    }
    public static void main(String[] args) {
        int n=1;
        printNumb(n);
    }
}
