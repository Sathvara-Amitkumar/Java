package RecursionAdvance;

import java.util.HashSet;

public class uniqueSequence {
    public static void uniqueSubSeq(String str, int idx, String newString, HashSet<String> set) {
        if(idx == str.length()) {
            if(set.contains(newString)) {
                return;
            }
            else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);
        uniqueSubSeq(str, idx+1, newString+currChar, set);

        uniqueSubSeq(str, idx+1, newString, set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniqueSubSeq(str, 0, "", set);
    }
}                           