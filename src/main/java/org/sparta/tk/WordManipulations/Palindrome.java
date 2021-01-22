package org.sparta.tk.WordManipulations;

import org.sparta.tk.Utilities.Printers;

public class Palindrome {

    public static boolean isInputValid(int inputValue) {
        if (inputValue == 0) {
            System.out.println("Input was 0.");
            isInputValid(Printers.palindromeMenu());
            return false;
        }
        isPalindrome(inputValue);
        return true;
    }

    public static boolean isPalindrome(int inputValue) {
        String integerToCheck = String.valueOf(inputValue);
        String reverseInteger = "";
        for (int i = integerToCheck.length() - 1; i >= 0; i--) {
            reverseInteger = reverseInteger.concat(String.valueOf(integerToCheck.charAt(i)));
        }
        if (reverseInteger.equalsIgnoreCase(integerToCheck)) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }
}
