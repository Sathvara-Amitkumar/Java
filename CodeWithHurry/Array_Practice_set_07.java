package CodeWithHurry;

public class Array_Practice_set_07 {
    public static void main(String[] args) {
        int[] arr = {12,45,21,1,99};
        int min = arr[0];
        for(int i:arr) {
            if(i < min) {
                min = i;
            }
        }
        System.out.println("Minimum Value is : " + min);
    }
}
