/*
My Java Project.
 */
package doublex;

/**
 *
 * @author jeshw_3agky5x
 */
public class doublex{
     public static void main(String[] args) {
        System.out.println(isFollowedByAnotherX("abcxx")); // true
        System.out.println(isFollowedByAnotherX("abcx"));  // false
        System.out.println(isFollowedByAnotherX("x"));     // false
        System.out.println(isFollowedByAnotherX(""));      // false
    }
    
    public static boolean isFollowedByAnotherX(String str) {
        int index = str.indexOf('x');
        if (index != -1 && index + 1 < str.length()) {
            return str.charAt(index + 1) == 'x';
        }
        return false;
    }
}


