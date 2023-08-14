package CodeWithHurry;
//Print Pattern No - 2
public class Methods_Practice_set_03 {
    static void pattern2(int n) {
        for(int i=n; i>0; i--) {
            for(int j=0; j<i; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern2(5);
    }
}
