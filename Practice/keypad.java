package Practice;

public class keypad {
    public static String keypad[] = {".","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};

    public static void keyCombine(String str, int idx, String Combination) {
        if(idx == str.length()) {
            System.out.println(Combination);
            return;
        }

        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];

        for(int i=0; i<mapping.length(); i++) {
            keyCombine(str, idx+1, Combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "25";
        keyCombine(str, 0, "");
    }
}