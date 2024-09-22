/*
My Java Project.
 */
package pkgclass.rectangle;

/**
 *
 * @author jeshw_3agky5x
 */
class Rectangle 
{ 
 void perimeter(int l, int w) 
 { 
 System.out.println("Length ="+l+", Width= "+w); 
 System.out.println("Perimeter = " + (l+w)); 
 } 
 void area(int l, int w) 
 { 
 perimeter(l,w); // Nesting of Method 
 System.out.println("Area = " + (l*w)); 
 } 
} 
class RectangleDemo 
{ 
 public static void main(String[] args) 
 { 
 Rectangle obj = new Rectangle(); 
 obj.area(5,4);
    }
    
}
