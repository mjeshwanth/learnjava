/*
My Java Project.
 */
package pkgclass.primeter;

/**
 *
 * @author jeshw_3agky5x
 */
class Perimeter 
 { 
 Perimeter() // default Constructor 
 { 
 System.out.println("No parameters"); 
 } 
 Perimeter(double r) // Parameterized Constructor 
 { 
 System.out.println("Perimeter of the Circle="+(2*3.14*r)); 
 } 
 Perimeter(int l, int b) // Parameterized constructor 
 { 
 System.out.println("Perimeter of the Rectangle="+(2*(l+b))); 
 } 
 } 
class ConstructorDemo 
 { 
 public static void main(String args[]) 
 { 
 Perimeter p1=new Perimeter(); 
 Perimeter p2=new Perimeter(10); 
 Perimeter p3=new Perimeter(10,20);
    }
    
}
