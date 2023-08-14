package CodeWithHurry;

public class Methods_Practice_set_07 {
    static int patt2Rec(int n) {
        if(n > 0) {
            for(int i=0; i<n; i++) {
                System.out.print("X ");
            }
            System.out.println();
            patt2Rec(n-1);
        }
        return 1;
    }
    public static void main(String[] args) {
        patt2Rec(5);
    }
}
