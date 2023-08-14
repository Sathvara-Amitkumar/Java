package CodeWithHurry;

public class Methods_Practice_set_05 {
    static float average(int ...arr) {
        float result = 0;
        for(int avg:arr) {
            result += avg;
        }
        return result / arr.length;
    }
    public static void main(String[] args) {
        System.out.println("5 Values sum is : " + average(12,34,43,21,12));
    }
}
