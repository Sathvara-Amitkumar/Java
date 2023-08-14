package CodeWithHurry;

public class for_each_loop {
    public static void main(String[] args) {
        int[] arr = {99,85,55,65,75};
        for(int i:arr) {
            System.out.print(i + " ");
        }
        System.out.println("\nArray Print in Reverse Order");
        for(int i=arr.length -1; i>=0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
