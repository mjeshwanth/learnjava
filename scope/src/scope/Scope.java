/*
My Java Project.
 */
package scope;

/**
 *
 * @author jeshw_3agky5x
 */
public class Scope {
   static int x = 5;  static {

System.out.println("Class Scope variable - outside main() x = " + x);
int y=10;
System.out.println("Variable y Scope within main() y = " + y); 
{
 int z =20;
 System.out.println(z+"Variable z Scope within Anonymous Block z="+z); 
}       
    }
    
}
