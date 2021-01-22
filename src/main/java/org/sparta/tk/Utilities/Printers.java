package org.sparta.tk.Utilities;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Printers {
    public static void printMenu() {
        System.out.println("----------------------");
        System.out.println("1. String Anagram");
        System.out.println("2. Integer Palindrome");
        System.out.println("3. String Permutations");
        System.out.println("4. Armstrong Number");
        System.out.println("----------------------");
    }

    public static int palindromeMenu() {
        int palindromeChoice;
        System.out.println("Integer Palindrome Check");
        while (true) {
            try {
                System.out.println("Please enter an integer combination");
                Scanner choice = new Scanner(System.in);
                palindromeChoice = choice.nextInt();
                return palindromeChoice;
            } catch (InputMismatchException e) {
                System.out.println("Invalid");
            }
        }
    }

    public static String[] stringAnagramMenu() {
        System.out.println("String Anagram Check");

        while (true) {
            try {
                System.out.println("Please enter first word");
                Scanner firstChoice = new Scanner(System.in);
                String firstC = firstChoice.next();
                System.out.println("Please enter second word");
                Scanner secondChoice = new Scanner(System.in);
                String secondC = secondChoice.next();

                return InputCheck.checkAnagramInput(firstC, secondC);
            } catch (InvalidWordException e) {
                System.out.println("Invalid characters");
            }
        }
    }


    public static String stringPermutationsMenu() {
        System.out.println("Permutation Generator");

        while (true) {
            try {
                System.out.println("Please enter word to generate all permutations");
                Scanner choice = new Scanner(System.in);
                String userChoice = choice.next();
                return InputCheck.checkWord(userChoice);

            } catch (InvalidWordException e) {
                System.out.println("Invalid characters");
            }
        }
    }

    public static int armstrongMenu() {
        int armstrongChoice;
        System.out.println("Armstrong Number Check");
        while (true) {
            try {
                System.out.println("Please enter an integer");
                Scanner choice = new Scanner(System.in);
                armstrongChoice = choice.nextInt();
                return armstrongChoice;
            } catch (InputMismatchException e) {
                System.out.println("Invalid");
            }
        }
    }
}
