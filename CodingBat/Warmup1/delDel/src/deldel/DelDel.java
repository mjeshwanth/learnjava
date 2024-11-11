/*
My Java Project.
 */
package deldel;

/**
 *
 * @author jeshw_3agky5x
 */
public class DelDel {

    /**
     * @param str
     * @return 
     */
    public static  String delDel(String str) {
   if (str.length()>=4 && str.substring(1, 4).equals("del")) {
    // First char + rest of string starting at 4
    return str.substring(0, 1) + str.substring(4);
  }
  // Otherwise return the original string.
  return str ;
}
    public static void main(String[] args) {
        System.out.println(delDel("adelbc"));// output = abc
    }
    
}
