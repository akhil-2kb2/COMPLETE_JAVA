package PPSU;

public class StringExample {
    public static void main(String[] args) {
        String name = "Shubhanshu";
        String college = "PPSU";

        // Printing string info
        System.out.println("Name: " + name);
        System.out.println("Length of name: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("First Character: " + name.charAt(0));

        // Concatenation
        String message = name + " studies at " + college;
        System.out.println("Message: " + message);

        // Comparing Strings
        String s1 = "PPSU";
        String s2 = "ppsu";
        System.out.println("s1 equals s2? " + s1.equals(s2));
        System.out.println("s1 equalsIgnoreCase s2? " + s1.equalsIgnoreCase(s2));
    }
}



