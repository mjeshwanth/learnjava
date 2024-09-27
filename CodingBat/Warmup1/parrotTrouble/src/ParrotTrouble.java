public class ParrotTrouble {

    public static boolean parrotTrouble(boolean isTalking, int hour) {
       return isTalking && (hour < 7 || hour > 20); 
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(parrotTrouble(true, 6));  
    }
}
