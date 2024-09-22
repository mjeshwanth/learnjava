/*
My Java Project.
 */
package sleepin;

/**
 *
 * @author jeshw_3agky5x
 */
public class SleepIn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean result = sleepIn(true, false);
        System.out.println("Result is "+result);
    }

    /**
     * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. 
     * We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
     * @param weekday
     * @param vacation
     * @return 
     */
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        boolean result = (!weekday || vacation);
        return result;
    }
}
