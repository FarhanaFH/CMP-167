/*
 * Name: Farhana
 * Problem3
 * CMP 167 
 * Professor: 
 */
public class Problem3
{
//generating a string of odd integers up to number 'n'
public static String odds(int n) {
	
	if (n == 0) { // If n is 0, empty string is returned
		return "";
	} else if (n < 0) { // If n is -, "NONE" is returned
		return "NONE";
	}
	
	String res = ""; // Initializing empty string to hold result
	int temp = 1; // Initializing temporary integer variable to start at 1 and increment by 2 in loop
	
	while (temp <= n) { // Loop until temporary variable exceeds input number 'n'
		char c = (char)(temp + '0'); // Converting temporary integer to a character & store it in a variable 'c'
		res += c; // Add character to result string
		if ((temp + 2) <= n) { // If there are more odd integers to add, add a comma after current integer
			res += ",";
		}
		temp += 2; 
	}
	
	return res; // Return result string
}

//Main method to test the 'odds' method with some sample inputs
	public static void main(String[] args) {
	System.out.println(odds(8)); // Prints "1,3,5,7"
	System.out.println(odds(-1)); // Prints "NONE"
	System.out.println(odds(0)); // Prints ""
	System.out.println(odds(5)); // Prints "1,3,5"
}
}

public class Odds {

    /**
     * Returns a String containing all positive odd numbers up to the given number (inclusive) if it is also odd.
     * If the argument is negative, returns "NONE".
     *
     * @param a The upper limit number
     * @return The String containing the positive odd numbers
     */
    public static String odds(int a) {
        if (a < 0) {
            return "NONE";
        }

        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= a; i++) {
            if (i % 2 != 0) {
                result.append(i).append(",");
            }
        }

        if (result.length() > 0) {
            result.deleteCharAt(result.length() - 1); // Remove the trailing comma
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Example usages
        System.out.println(odds(5));  // Output: "1,3,5"
        System.out.println(odds(8));  // Output: "1,3,5,7"
        System.out.println(odds(9));  // Output: "1,3,5,7,9"
        System.out.println(odds(-5)); // Output: "NONE"
        System.out.println(odds(0));  // Output: ""
        System.out.println(odds(1));  // Output: "1"
    }
}
