/*
 * Name: Farhana Hussen
 * CMP 167
 * MidtermProblems 1
 * Professor: STEVEN FULAKEZA
 */
public class MidtermProblems {

    // Method to replace 1st character of a string with a given character
    public static String replaceFirst(String s, char c) {
        
        // If string is null or empty, returning it as it is
        if (s == null || s.isEmpty())
            return s;

        // If string isn't empty, replace 1st character with given character
        String modified = c + s.substring(1);
        
        // Returning modified string
        return modified;
    }

    // Main method for testing
    public static void main(String[] args) {
        
        // Test the replace 1st method with inputs and print output
        System.out.println(replaceFirst("make", 't')); // Output: "take"
        System.out.println(replaceFirst("a", 'x')); // Output: "x"
        System.out.println(replaceFirst("", 'c')); // Output: ""
        System.out.println(replaceFirst(null, 'z')); // Output: null
    }
}