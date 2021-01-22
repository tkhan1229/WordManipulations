package org.sparta.tk;

import org.junit.Assert;
import org.junit.Test;
import org.sparta.tk.WordManipulations.Palindrome;

public class PalindromeTests {

    @Test
    public void testInvalidInput() {
        //should prompt re-entry
        Assert.assertTrue(Palindrome.isInputValid(0));
    }

    @Test
    public void testValidInput() {
        //should return true
        Assert.assertTrue(Palindrome.isInputValid(1001));
    }

    @Test
    public void testIsPalindrome() {
        int trueTestVal = 1001;
        //should return true
        Assert.assertTrue(Palindrome.isPalindrome(trueTestVal));
    }

    @Test
    public void testIsNotPalindrome() {
        int falseTestVal = 1234;
        //should return false
        Assert.assertFalse(Palindrome.isPalindrome(falseTestVal));
    }
}
