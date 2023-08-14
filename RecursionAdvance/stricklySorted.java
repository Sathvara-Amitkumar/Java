package RecursionAdvance;

public class stricklySorted {
    public static boolean isSorted(int arr[], int idx) {
        if(idx == arr.length-1) {
            return true;
        }

        if(arr[idx] >= arr[idx+1]) {
            // strickly Sorted
            return false;
        }
        return isSorted(arr, idx+1);
    }
    public static void main(String[] args) {
        int arr[] = {2 , 3 , 5 , 5};
        System.out.println(isSorted(arr, 0));
    }
}
