/*
My Java Project.
 */
package or35;

/**
 *
 * @author jeshw_3agky5x
 */
public class Or35 {

    /**
     * @param n
     * @return 
     */
    public  static boolean or35(int n) {
        // given number is divisble 3 or 5
  return (n%3==0) || (n%5==0);
}
    public static void main(String[] args) {
        System.out.println(or35(3));// output =true
    }
    
}
