package CodeWithHurry;

public class cwh_31_methods {
    static int logic(int x, int y) {
        int z;
        if(x>y) {
            z = x + y;
        }
        else {
            z = (x+y) * 5;
        }
        return z;
    }

    static void change(int x) {
        x=75;
    }

    public static void main(String[] args) {
        int a=5,b=4;
        int c = logic(a,b);
        System.out.println("SUM of two Value is : " + c);

//        cwh_31_methods obj = new cwh_31_methods();
//        int c = obj.logic(a,b);
//        System.out.println("SUM of two Value is : " + c);

        int n = 45;
        change(n);
        System.out.println(n);
    }
}
