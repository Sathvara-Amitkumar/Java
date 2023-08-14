package Practice;

public class vowelNumber {
    public static void main(String[] args) {

           
            String ch = new String("Error World");
            for(int i=0; i<ch.length(); i++) {
                if(ch.charAt(i) == 'a' || ch.charAt(i) == 'e'|| ch.charAt(i) == 'i' || ch.charAt(i) == 'o' || ch.charAt(i) == 'u' || 
                   ch.charAt(i) == 'A' || ch.charAt(i) == 'E' || ch.charAt(i) == 'I' || ch.charAt(i) == 'O' || ch.charAt(i) == 'U') {
                    System.out.println("Given String Contains " + ch.charAt(i) + " at index  " + i);
                }
            }
            
            
    }
}

