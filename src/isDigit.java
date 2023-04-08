package src;

import org.jetbrains.annotations.NotNull;

public class isDigit {
    /**
     * This function checks whether the given string consists of all digits.
     *
     * @param s the string to check
     * @return true if the string consists of all digits, false otherwise
     */
    public static boolean isAllDigits(@NotNull String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) {
                // If the character is not a digit, return false
                return false;
            }
        }
        // If we get here, all characters are digits, so return true
        return true;
    }
}
