public class Front3 {
public static String front3(String str) {
        String front;
        
        // Check if the string length is less than 3
        if (str.length() < 3) {
            front = str;
        } else {
            // Get the first 3 characters of the string
            front = str.substring(0, 3);
        }
        
        // Return the front string repeated 3 times
        return front + front + front;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(front3("Java"));  
 }
}
