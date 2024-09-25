public class MonkeyTrouble {
    public static boolean MonkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile && bSmile) || (!aSmile && !bSmile);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(MonkeyTrouble(true, true));    
    }
}
  




