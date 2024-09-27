public class PosNeg {

    public static boolean posNeg(int a, int b, boolean negative) {
        // If negative is true, return true only if both a and b are negative
        if (negative) {
            return (a < 0 && b < 0);
        }
        return (a < 0 && b >= 0) || (a >= 0 && b < 0);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(posNeg(1, -1, false));
    }
}

