package PatternAdvance;

public class butterflyPattern {
    public static void main(String[] args) {
        int n = 5;
        //Upper Half
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("X");
            }
            
            //Number of Spaces
            int Spaces = 2 * (n-i);
            for(int j=1; j<=Spaces; j++) {
                System.out.print(" ");
            }

            //2nd Part
            for(int j=1; j<=i; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
        //Lower Half
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("X");
            }
            
            //Number of Spaces
            int Spaces = 2 * (n-i);
            for(int j=1; j<=Spaces; j++) {
                System.out.print(" ");
            }

            //2nd Part
            for(int j=1; j<=i; j++) {
                System.out.print("X");
            }
            System.out.println();
        }   
    }
}
