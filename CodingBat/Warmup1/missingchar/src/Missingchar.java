public class Missingchar {
    public static String removeCharAtIndex(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }

    public static void main(String[] args) {
        String result = removeCharAtIndex("example", 2);
        System.out.println(result);
}
}

