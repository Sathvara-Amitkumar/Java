package LeetCode;

public class Problem_03 {
    public static void main(String[] args) {
        System.out.println(mountainArray(2,5,8,4,3));
    }

    //  1st Method
//    static int mountainArray(int...arr) {
//        int i=0;
//        while(arr[i] < arr[i+1]) {
//            i++;
//        }
//        return i;
//    }

    //  2nd Method
//    static int mountainArray(int...arr) {
//        for(int i=0; i<arr.length; i++) {
//            if(arr[i] > arr[i+1]) {
//                return i;
//            }
//        }
//        return -1;
//    }

    //  3rd Method
    static int mountainArray(int...arr) {
        int low = 0, high = arr.length - 1;
        while(low < high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] < arr[mid+1]) {
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }
        return low;
    }
}
