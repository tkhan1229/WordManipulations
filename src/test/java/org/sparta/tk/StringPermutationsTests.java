package org.sparta.tk;

import org.junit.Assert;
import org.junit.Test;
import org.sparta.tk.WordManipulations.StringPermutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringPermutationsTests {
    String testWord = "GOD";
    ArrayList<String> expectedPermutations = new ArrayList<>(Arrays.asList("GOD", "ODG", "OGD", "DOG", "GDO", "DGO"));

    @Test
    public void testInvalidInput() {
        //should prompt re-entry
        Assert.assertFalse(StringPermutations.isInputValid(null));
    }

    @Test
    public void testValidInput() {
        //should return true
        Assert.assertTrue(StringPermutations.isInputValid(testWord));
    }

    @Test
    public void testAllCorrectPermutations() {
        Set<String> expectedValues = new HashSet<>(expectedPermutations);
        Assert.assertEquals(expectedValues, StringPermutations.getAllPermutations(testWord));
    }

    @Test
    public void testAllFalsePermutations() {
        String falseTestWord = "CRY";
        Set<String> expectedValues = new HashSet<>(expectedPermutations);
        Assert.assertNotSame(expectedValues, StringPermutations.getAllPermutations(falseTestWord));
    }

    @Test
    public void testAllCorrectPermutationsDistinct() {
        ArrayList<String> expectedDoubleLetterPermutations = new ArrayList<>(Arrays.asList("GODO", "OODG", "OGDO", "DOOG", "GDOO", "DGOO", "GOOD", "ODGO", "OGOD", "DOGO", "ODOG", "OOGD"));
        Set<String> expectedValues = new HashSet<>(expectedDoubleLetterPermutations);
        Assert.assertEquals(expectedValues, StringPermutations.getAllPermutations("GOOD"));
    }
}
