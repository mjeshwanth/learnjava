public class sumDouble {
    public static void main(String[] args) {
        sumDouble obj = new sumDouble();
        
        System.out.println(obj.sumOrDouble(5, 5));  
        System.out.println(obj.sumOrDouble(3, 4)); 
    }
      public int sumOrDouble(int a, int b) {
        if (a == b) {
            return 2 * (a + b);
        } else {
            return a + b;
}
      }
}
