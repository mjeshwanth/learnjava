/*
My Java Project.
 */
package loneteen;

/**
 *
 * @author jeshw_3agky5x
 */
public class Loneteen {

    /**
     * @param a
     * @param b
     * @return 
     */
       public static  boolean loneTeen(int a, int b) {
  boolean aTeen = (a >= 13 && a <= 19);
  boolean bTeen = (b >= 13 && b <= 19);
  // the vaule mus be between 13 to 19
  return (aTeen && !bTeen) || (!aTeen && bTeen);
  // this case either one vaule must be underv13 to 19 
}

    public static void main(String[] args) {
        System.out.println(loneTeen(14,26));// ouput = true
    }
    
}
