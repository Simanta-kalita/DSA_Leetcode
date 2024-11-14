import java.util.*;

public class educative_2 {
    public static int myAtoi(String s) {

        int i = 0;
        int sign = 1;
        int result = 0;

        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        while (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-')
                sign = -1;
            i++;
        }

        while (i < s.length() && (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
            int digit = s.charAt(i) - '0';
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            i++;
        }
        return sign * result;
    }

    // Driver code
    public static void main(String[] args) {
        String[] inputStrings = { "25", "   -25", "999 with words", "words and 567", "-91283472332", "91283472332" };

        for (int i = 0; i < inputStrings.length; i++) {
            System.out.println((i + 1) + ".\tInput string     : \"" + inputStrings[i] + "\"");
            int stoi = myAtoi(inputStrings[i]);
            System.out.println("\tConverted integer: " + stoi);
            // System.out.println(PrintHyphens.repeat("-",100));
        }
    }

}
