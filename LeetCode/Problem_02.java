package LeetCode;

import java.util.HashSet;

public class Problem_02 {
    public static void main(String[] args) {
        System.out.println(duplicates(1,2,3,1));
    }
    //  1st Method
    //  Time Complexity  => O(n^2)
//    static boolean duplicates(int... arr) {
//        for(int i=0; i<arr.length; i++) {
//            for(int j=i+1; j<arr.length; j++) {
//                if(arr[i] == arr[j]) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    //  2nd Method
//    static boolean duplicates(int... arr) {
//        Arrays.sort(arr);
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] == arr[i + 1]) {
//                return true;
//            }
//        }
//        return false;
//    }

    //  3rd Method
    static boolean duplicates(int... arr) {
        HashSet<Integer> num = new HashSet<>();
        for(int i=0; i<arr.length; i++) {
            if(num.contains(arr[i])) {
                return true;
            }
        }
        return false;
    }
}
