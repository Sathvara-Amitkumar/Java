package Patterns;

public class HollowRectangle {
    public static void main(String[] args) {
        int n = 7;
        int m = 9;
        
        //outer loop
        for (int i=1; i<=n; i++) {
            //inner loop
            for (int j=1; j<=m; j++) {
                //cell -> (i,j)
                if (i==1 || j==1 || i==n || j==m) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
