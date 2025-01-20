/*
My Java Project.
 */
package extraend;

/**
 *
 * @author jeshw_3agky5x
 */
public class StringManipulation {
    public static void main(String[] args) {
        String input = "Hello";  // Example input string
        
        // Call the method and store the result
        String result = repeatLastTwoChars(input);
        
        // Output the result
        System.out.println(result);
    }
    
    // Method that returns a new string with 3 copies of the last 2 characters
    public static String repeatLastTwoChars(String str) {
        // Check if the string has at least 2 characters
        if (str.length() >= 2) {
            // Extract the last 2 characters and repeat them 3 times
            String lastTwoChars = str.substring(str.length() - 2);
            return lastTwoChars + lastTwoChars + lastTwoChars;
        } else {
            // If the string is shorter than 2 characters, return the string repeated 3 times
            return str + str + str;
        }
    }
}

    

