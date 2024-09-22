/*
My Java Project.
 */
package pkgclass.permiter;

/**
 *
 * @author jeshw_3agky5x
 */
class perimeter{
 perimeter() 
 { 
 System.out.println("No parameters"); 
 } 
 perimeter(double r) 
 { 
 System.out.println("Perimeter of the Circle="+(2*3.14*r)); 
 } 
 perimeter(int l, int b) 
 { 
 System.out.println("Perimeter of the Rectangle="+(2*(l+b))); 
 } 
 } 
class ConstructorDemo 
 { 
 public static void main(String args[]) 
 { 
 perimeter p1=new perimeter();    
 Perimeter p2=new Perimeter(10); 
 Perimeter p3=new Perimeter(10,20);
 }
}
