package Strings.StringBuilder;

public class moreproperty {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("ERROR");
        System.out.println(sb.length());
        //charAt
        System.out.println(sb.charAt(4));

        //set char atb index 0
        sb.setCharAt(0, 'M');
        System.out.println(sb);

        //insert
        sb.insert(0, 'E');
        System.out.println(sb);

        //delete
        sb.delete(1, 2);
        System.out.println(sb);

        
    }
}
