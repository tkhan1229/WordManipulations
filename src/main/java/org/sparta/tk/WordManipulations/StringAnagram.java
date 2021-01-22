package org.sparta.tk.WordManipulations;

import org.sparta.tk.Utilities.Printers;

public class StringAnagram {

    public static boolean isInputsValid(String[] words) {
        if (words[0] == null || words[1] == null) {
            System.out.println("Invalid words.");
            Printers.stringPermutationsMenu();
            return false;
        }
        if (words[0].equalsIgnoreCase(words[1])) {
            System.out.println("Invalid words. Both the same word.");
            Printers.stringPermutationsMenu();
            return false;
        }
        isAnagram(words[0], words[1]);
        return true;
    }

    public static boolean isAnagram(String word1, String word2) {
        char[] word1CharList = word1.toLowerCase().toCharArray();

        if (word1.length() == word2.length() && !word1.equalsIgnoreCase(word2)) {
            for (char letterToCheck : word1CharList) {
                if (word2.indexOf(letterToCheck) < 0) {
                    System.out.println("false");
                    return false;
                } else {
                    System.out.println("true");
                    return true;
                }
            }
        }
        System.out.println("false");
        return false;
    }
}
