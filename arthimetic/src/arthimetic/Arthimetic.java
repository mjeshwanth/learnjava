/*
My Java Project.
 */
package arthimetic;

import java.util.Scanner;

/**
 *
 * @author jeshw_3agky5x
 */
public class Arthimetic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scaninput = new Scanner(System.in);
        int n;
        int m;
        System.out.print("Enter the value of n: ");
        n = scaninput.nextInt();
        System.out.print("Enter the value of m: ");
        m = scaninput.nextInt();
        System.out.println("Sum of two numbers is =" + (n + m));
        System.out.println("Product of two numbers is =" + n * m);
        System.out.println("Modulus of (n%m) is =" + n % m);
        System.out.println("Division of two numbers is =" + n / m);
    }

}
