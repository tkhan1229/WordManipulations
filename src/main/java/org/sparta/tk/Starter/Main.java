package org.sparta.tk.Starter;

import org.sparta.tk.Utilities.Printers;
import org.sparta.tk.WordManipulations.ArmstrongNumber;
import org.sparta.tk.WordManipulations.Palindrome;
import org.sparta.tk.WordManipulations.StringAnagram;
import org.sparta.tk.WordManipulations.StringPermutations;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Printers.printMenu();
        Scanner choice = new Scanner(System.in);
        int userChoice = choice.nextInt();
        switch (userChoice) {
            case 1 -> StringAnagram.isInputsValid(Printers.stringAnagramMenu());
            case 2 -> Palindrome.isInputValid(Printers.palindromeMenu());
            case 3 -> StringPermutations.isInputValid(Printers.stringPermutationsMenu());
            case 4 -> ArmstrongNumber.isArmstrong(Printers.armstrongMenu());
        }
    }
}
