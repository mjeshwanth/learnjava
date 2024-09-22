/*
My Java Project.
 */
package pkgclass.farm;

/**
 *
 * @author jeshw_3agky5x
 */
class Farm 
{ 
 double length; 
 double width; 
 double area() 
 { 
 return length*width; 
 } 
} 
public class FarmExel 
{ 
 public static void main (String args[]) 
 { 
 Farm farm1 = new Farm(); 
 Farm farm2 = new Farm();  
 
 farm1.length = 20.0; 
 farm1.width = 40.0; 
 System.out.println(farm1.area() +"Area of farm1= "); 
 
 farm2 = farm1;  
 
 System.out.println("Area of farm2 = " +farm2.area());
 }
}
