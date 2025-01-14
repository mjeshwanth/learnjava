/*
My Java Project.
 */
package firsthalf;

/**
 *
 * @author jeshw_3agky5x
 */
public class FirstHalf {

    /**
     * @param str
     * @return 
     */
   public static  String firstHalf(String str) {
  int mid= str.length() /2;
  return str.substring(0,mid);
}

    public static void main(String[] args) {
        String input = "jesh";
        System.out.println(firstHalf(input));
    }
    
}
