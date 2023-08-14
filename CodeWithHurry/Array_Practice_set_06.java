package CodeWithHurry;

public class Array_Practice_set_06 {
    public static void main(String[] args) {
        int[] arr = {12,45,21,41,99};
        int max = 0;
        for(int i:arr) {
//            i   max
//           |4|  |99|
            if(i > max) {
                max = i;
            }
        }
        System.out.println("Maximum Value is : " + max);
    }
}