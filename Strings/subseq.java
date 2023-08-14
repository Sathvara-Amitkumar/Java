package Strings;

public class subseq {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static void printComb(String str, int idx, String Combination) {
        if(idx == str.length()) {
            System.out.println(Combination);
            return;
        }

        char currchar = str.charAt(idx);
        String mapping = keypad[currchar - '0'];
        
        for(int i=0; i<mapping.length(); i++) {
            printComb(str, idx+1, Combination + mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "23";
        printComb(str, 0, " ");
    }
}
