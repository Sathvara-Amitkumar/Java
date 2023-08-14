package CodeWithHurry;

public class Array_Practice_set_03 {
    public static void main(String[] args) {
        int[] mark = {99,95,55,65,75};
        int num = 55;
        boolean isInArray = false;
        for(int i:mark) {
            if(num == i) {
                isInArray = true;
            }
        }
        if(isInArray) {
            System.out.println("Value is Exist in the Array");
        }
        else {
            System.out.println("Value is Not Exist in the Array");
        }
    }
}
