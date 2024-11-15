import java.util.*;

public class educative_3 {
    public static boolean isPalindrome(String s) {

        int firstPointer = 0;
        int lastPointer = s.length() - 1;

        while (firstPointer <= lastPointer) {
            if (s.charAt(firstPointer) != s.charAt(lastPointer))
                return false;
            firstPointer++;
            lastPointer--;
        }

        return true;
    }

    // Driver code
    public static void main(String[] arg) {
        String[] testCase = {
                "RACECAR",
                "ABBA",
                "TART"
        };
        for (int k = 0; k < testCase.length; k++) {
            System.out.println("Test Case # " + (k + 1));
            System.out.println(isPalindrome(testCase[k]));
            System.out.println(new String(new char[100]).replace('\0', '-'));
        }
    }

}
