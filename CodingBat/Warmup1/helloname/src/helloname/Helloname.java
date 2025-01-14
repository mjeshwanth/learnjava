/*
My Java Project.
 */
package helloname;

/**
 *
 * @author jeshw_3agky5x
 */
public class Helloname {

    /**
     * @param args 
     */
   public static void main(String[] args) {
        String name = "Bob";
        System.out.println(generateGreeting(name));
    }

    public static String generateGreeting(String name) {
        return "Hello " + name + "!";
    }
}
