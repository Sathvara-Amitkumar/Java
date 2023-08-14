package Patterns;

public class rotated {
    public static void main(String[] args) {
        int n = 7;

        // outer loo
        for (int i=1; i<=n; i++) {
            //inner loop
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //inner loop - start print
            for(int j=1; j<=i; j++){
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
