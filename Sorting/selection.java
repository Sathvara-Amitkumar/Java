package Sorting;
//Time complexity => O(n^2)
public class selection {
    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {7 , 3 , 8 , 2 , 1};
     
        //Selection Sort
        for(int i=0; i<arr.length - 1; i++) {   
            int samllest = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[samllest] > arr[j]) {
                    samllest = j;
                }
            }
            //swap
            int temp = arr[samllest];
            arr[samllest] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
}