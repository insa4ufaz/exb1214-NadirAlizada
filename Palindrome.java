public class Palindrome{
    public static boolean is_palindrome(String s)
    {
    int i = 0, j = s.length() - 1;
 
        // While there are characters to compare
        while (i < j) {
 
            // If there is a mismatch
            if (s.charAt(i) != s.charAt(j))
                return false;
 
            i++;
            j--;
    }
    return true;
    }
}
