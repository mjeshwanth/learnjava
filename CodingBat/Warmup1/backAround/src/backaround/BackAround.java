/*
My Java Project.
 */
package backaround;

/**
 *
 * @author jeshw_3agky5x
 */

public class BackAround {
    public static String frontBackAdd(String str) {
        // Get the last character of the string
        char lastChar = str.charAt(str.length() - 1);
        // Return the new string with the last character added at the front and back
        return lastChar + str + lastChar;
    }

    public static void main(String[] args) {
        String result = frontBackAdd("cat");
        System.out.println(result); // Output: tcatt
    }
}
