package CodeWithHurry;
//Calculate sum of first N natural numbers using Recursion
public class Methods_Practice_set_02 {
    static int sumRec(int n) {
        if(n == 1) {
            return 1;
        }
        else {
            return n + sumRec(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Sum of first n natural numbers : " + sumRec(5));
    }
}
