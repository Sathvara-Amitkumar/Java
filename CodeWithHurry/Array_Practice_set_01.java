package CodeWithHurry;

public class Array_Practice_set_01 {
    public static void main(String[] args) {
        int[] mark = {99,95,55,65,75};
        int sum = 0;
        for(int i=0; i<mark.length  ; i++) {
            sum += mark[i];
        }
        System.out.println("SUM of Array is : " + sum);

//      Practice Set 02
        //Average of Above array
        float a = sum / mark.length;
        System.out.println("Average of SUM is : " + a);
    }
}
