/*
My Java Project.
 */
package makeoutworld;

/**
 *
 * @author jeshw_3agky5x
 */
public class MakeOutworld {

    /**
     * @param out
     * @param word
     * @return 
     */
    public static String makeOutWord(String out, String word) {
  String firstPart ="<<";
        String lastPart = ">>";
        
        // Return the new string with the word in the middle
        return firstPart + word + lastPart;
}

    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>", "hello"));
    }
    
}
