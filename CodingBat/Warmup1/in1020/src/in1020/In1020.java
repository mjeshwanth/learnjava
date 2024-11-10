/*
My Java Project.
 */
package in1020;

/**
 *
 * @author jeshw_3agky5x
 */
public class In1020 {

    /**
     * @param a
     * @param b
     * @return 
     */
    public static boolean in1020(int a, int b) {
  return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
  // whether the two of vaules having one 10 to 20 comdition is true
}
    public static void main(String[] args) {
       System.out.println(in1020(11,55));// output = true
    }
    
}
