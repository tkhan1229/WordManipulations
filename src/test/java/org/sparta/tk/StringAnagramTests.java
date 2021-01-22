package org.sparta.tk;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.sparta.tk.WordManipulations.StringAnagram;

public class StringAnagramTests {
    String trueAnagramPair1 = "army";
    String trueAnagramPair2 = "Mary";
    String falseAnagram = "snip";

    @Test
    void testValidInput() {
        String[] inputs = {trueAnagramPair1, trueAnagramPair2};
        //should return true as valid anagram pair
        Assert.assertTrue(StringAnagram.isInputsValid(inputs));
    }

    @Test
    void testBothInvalidInput() {
        String[] inputs = {null, null};
        //should return false as not an anagram pair
        Assert.assertFalse(StringAnagram.isInputsValid(inputs));
    }

    @Test
    void testOneInvalidInput() {
        String[] inputs = {trueAnagramPair1, null};
        //should return false as not an anagram pair
        Assert.assertFalse(StringAnagram.isInputsValid(inputs));
    }

    @Test
    void testBothSameWord() {
        String[] inputs = {trueAnagramPair1, trueAnagramPair1};
        //should return false as not an anagram pair
        Assert.assertFalse(StringAnagram.isInputsValid(inputs));
    }

    @Test
    void testIsAnagram() {
        //this should return true as correct anagram pair
        Assert.assertTrue(StringAnagram.isAnagram(trueAnagramPair1, trueAnagramPair2));
    }

    @Test
    void testIsNotAnagram() {
        //this should return false as incorrect anagram pair
        Assert.assertFalse(StringAnagram.isAnagram(falseAnagram, trueAnagramPair2));
    }
}
