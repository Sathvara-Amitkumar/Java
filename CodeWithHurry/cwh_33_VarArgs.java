package CodeWithHurry;

public class cwh_33_VarArgs {
    static int sum(int ...arr) {
        int result = 0;
        for(int i:arr) {
            result += i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("2 Values sum is : " + sum(5,7));
        System.out.println("3 Values sum is : " + sum(5,7, 4));
        System.out.println("4 Values sum is : " + sum(5,7,8,9));
        System.out.println("5 Values sum is : " + sum(5,7,8,9,12));
        System.out.println("Thank You so Much");
    }
}
