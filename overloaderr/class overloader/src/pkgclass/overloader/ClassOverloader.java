/*
My Java Project.
 */
package pkgclass.overloader;

/**
 *
 * @author jeshw_3agky5x
 */
class perimter
 { 
 Perimeter() 
 { 
 System.out.println("No parameters"); 
 } 
 Perimeter(double r) //Constructor Overloading 
 { 
 System.out.println("Perimeter of the Circle="+(2*3.14*r)); 
 } 
 Perimeter(int l, int b) // Constructor Overloading 
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
