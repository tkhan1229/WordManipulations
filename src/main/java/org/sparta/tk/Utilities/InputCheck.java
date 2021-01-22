package org.sparta.tk.Utilities;

public class InputCheck {
    public static String[] checkAnagramInput(String word1, String word2) throws InvalidWordException{
        String[] words = new String[2];
        if(word1.matches("[a-zA-Z]+") && word2.matches("[a-zA-Z]+")){
            words[0] = word1;
            words[1] = word2;
            return words;
        }else{
            throw new InvalidWordException("Invalid characters");
        }
    }

    public static String checkWord(String word) throws InvalidWordException{
        if(word.matches("[a-zA-Z]+")){
            return word;
        }else{
            throw new InvalidWordException("Invalid characters");
        }
    }
}
