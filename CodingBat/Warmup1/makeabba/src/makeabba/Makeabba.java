/*
My Java Project.
 */
package makeabba;

/**
 *
 * @author jeshw_3agky5x
 */
public class Makeabba {

    /**
     * @param a
     * @param b
     * @return 
     */
    public static String makeAbba(String a, String b) {
  return a+b+b+a ;
}
    public static void main(String[] args) {
      String a = "first";  // Example string a
        String b = "second"; // Example string b
        
        // Call the method and store the result
        String result = makeAbba(a, b);
        
        // Output the result
        System.out.println(result);
    }
      
    }
    
