package org.sparta.tk.WordManipulations;

import java.util.ArrayList;

public class ArmstrongNumber {
    public static boolean isArmstrong(int userChoice) {
        int temp = userChoice;
        ArrayList<Integer> userChoiceDigits = new ArrayList<>();
        int sumOfDigitsCubed = 0;

        while (temp > 0) {
            int moduloTemp = temp % 10;
            userChoiceDigits.add(0, moduloTemp);
            temp = temp / 10;
        }

        for (Integer digit : userChoiceDigits) {
            sumOfDigitsCubed += Math.pow(digit, 3);
        }

        if (sumOfDigitsCubed == userChoice) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}
