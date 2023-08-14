package CodeWithHurry;

public class Methods_Practice_set_06 {
    static int patt1Rec(int n) {
        if(n > 0) {
            patt1Rec(n-1);
            for(int i=0; i<n; i++) {
                System.out.print("X ");
            }
            System.out.println();
        }

            return 1;
    }
    public static void main(String[] args) {
        patt1Rec(5);
    }
}
