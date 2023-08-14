package RecursionAdvance;

public class MoveallX {
    public static void moveallX(String str , int idx , int count , String newString) {
        if(idx == str.length()) {
            for(int i=0; i<count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x') {
            count++;
            moveallX(str, idx+1, count, newString);
        }
        else {
            newString += currChar;
            moveallX(str, idx+1, count, newString);
        }
    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        moveallX(str, 0, 0, "");
    }
}