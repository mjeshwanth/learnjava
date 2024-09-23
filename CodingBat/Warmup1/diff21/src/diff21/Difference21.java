/*
My Java Project.
 */
package diff21;

/**
 *
 * @author jeshw_3agky5x
 */
public class Difference21 {
    public static int diff21(int n) {
        if (n > 21) {
            return 2 * (n - 21);
        } else {
            return 21 - n;
        }
    }
    public static void main(String[] args) {
        System.out.println(diff21(19));  
        System.out.println(diff21(10));  
        System.out.println(diff21(21));  
        System.out.println(diff21(25));  
    }
}
