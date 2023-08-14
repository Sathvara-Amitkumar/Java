package LeetCode;
//Convert String in Lower Case
public class Problem_01 {
    static String toLowerCase(String s) {
        // 1st Method
//        char[] c = s.toCharArray();
//
//        for(int i=0; i<c.length; i++) {
//            if(c[i] >= 65 && c[i] <= 90) {
//                c[i] += 32;
//            }
//        }
//        return String.valueOf(c);

        // 2nd Method
//        String result = " ";
//        for(int i=0; i<s.length(); i++) {
//            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
//                result += (char) (s.charAt(i) + 32);
//            }
//            else {
//                result += (char) (s.charAt(i));
//            }
//        }
//        return result;

        // 3rd Method
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()) {
            if(c >= 65 && c <= 90) { // ToUpperCase (c >= 97 && c <= 123) -> c -=32
                c += 32;    // c = (char) (c - 'A' + 'a');`
            }
            sb.append(c);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "ERROR";
        System.out.println(toLowerCase(s).concat(" 404"));
    }
}
