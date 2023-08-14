package Strings;

public class strfunction {
    public static void main(String[] args) {
        // Problem 1
        String sentence = "I am IT student";
        String name = sentence.substring(5,sentence.length());
        System.out.println(name);

        // problem 2
        String str = "Hello Friend NOW !";
        str = str.replace(" ", "_");
        System.out.println(str);

        // Problem 3
        String letter = "Dear <|name|>, Thank You !";
        letter = letter.replace("<|name|>", "Amit");
        System.out.println(letter);

        // Problem 4
        String text = "Dear Codder,\n\t I am Learn for JAVA, \n\t Thank You !";
        System.out.println(text);

        // Problem 5
        String name1 = "john wick";
        System.out.println(name1.toUpperCase());

        // Problem 6
        String space = "The quick brown  fox jump over the lazy Dog";
        System.out.println(space.indexOf("  "));
        System.out.println(space.indexOf("   "));

        //Problem 7
        String next = "   ERROR404    ";
        System.out.println(next.trim());

        //Problem 8
        String barabar = "Amit";
        System.out.println(barabar.equals("amit"));

        //Problem 9 
        System.out.println(barabar.equalsIgnoreCase("aMiT"));

        //Problem 10
        System.out.println("I am a, \n\t CODER");
    }
}
