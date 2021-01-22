package org.sparta.tk.WordManipulations;

import org.sparta.tk.Utilities.Printers;

import java.util.*;

public class StringPermutations {
    public static boolean isInputValid(String inputValue) {
        if (inputValue == null) {
            System.out.println("Input was found to be null.");
            isInputValid(Printers.stringPermutationsMenu());
            return false;
        }
        System.out.println(getAllPermutations(inputValue));
        return true;
    }

    public static Set<String> getAllPermutations(String testWord) {
        ArrayList<String> allCorrectPermutations = new ArrayList<>();

        if (testWord.length() == 1) {
            allCorrectPermutations.add(testWord);
        } else {
            char firstLetter = testWord.charAt(0);
            String remaining = testWord.substring(1);
            for (String permutation : getAllPermutations(remaining)) {
                allCorrectPermutations.addAll(insertAtAllPositions(firstLetter, permutation));
            }
        }
        return new HashSet<>(allCorrectPermutations);
    }

    public static ArrayList<String> insertAtAllPositions(char firstLetter, String remaining) {
        ArrayList<String> suffix = new ArrayList<>();
        for (int i = 0; i <= remaining.length(); ++i) {
            String inserted = remaining.substring(0, i) + firstLetter + remaining.substring(i);
            suffix.add(inserted);
        }
        return suffix;
    }
}
