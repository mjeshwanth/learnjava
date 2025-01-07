/*
My Java Project.
 */
package stringtimes;

/**
 *
 * @author jeshw_3agky5x
 */
public class StringTimes {


    /**
     * @param str
     * @param n
     * @return 
     */
   public static String repeatString(String str, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(str);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String originalString = "Hello";
        int copies = 3;
        String largerString = repeatString(originalString, copies);
        System.out.println(largerString); // Output: HelloHelloHello
    }
}
