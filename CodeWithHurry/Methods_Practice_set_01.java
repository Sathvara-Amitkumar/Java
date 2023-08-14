package CodeWithHurry;
//Pattern
public class Methods_Practice_set_01 {
    static void pattern1(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern1(5);
    }
}
