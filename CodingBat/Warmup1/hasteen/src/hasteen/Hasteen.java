/*
My Java Project.
 */
package hasteen;

/**
 *
 * @author jeshw_3agky5x
 */
public class Hasteen {

    /**
     * @param a
     * @param b
     * @param c
     * @return 
     */
    public static boolean hasTeen(int a, int b, int c) {
  return (a>=13&&a<=19)|| (b>=13&&b<=19) || (c>=13&&c<=19);
  // whether the given numbers of a,b,c is 13 to 19
}
    public static void main(String[] args) {
        System.out.println(hasTeen(14,15,16));
        // output =true
    }
    
}
