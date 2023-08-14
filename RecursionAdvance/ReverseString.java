package RecursionAdvance;

public class ReverseString {
    public static void printRev(String str , int idx) {
        if(idx == 0) {
            System.out.println(str.charAt(idx));
        }
        System.out.print(str.charAt(idx));
        printRev(str, idx-1);
    }
    public static void main(String[] args) {
        String str = "maR irhS yaJ";
        printRev(str, str.length() - 1);
    }
}
