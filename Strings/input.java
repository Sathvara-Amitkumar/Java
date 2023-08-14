package Strings;

public class input {
    public static void main(String[] args) {
        String name1 = "ERROR";
        String name2 = "404";
        String fullname = name1 + " " + name2;
        //Length
        System.out.print(fullname);
        System.out.println(" - " + fullname.length());
        
        //charAt
        for(int i=0; i<fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }

        //Compare
        String name3 = "Amit";
        String name4 = "Amit";

        if(name3.compareTo(name4) == 0) {
            System.out.println("Strings are equal");
        }
        


    }
}
