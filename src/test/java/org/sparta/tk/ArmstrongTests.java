package org.sparta.tk;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.sparta.tk.WordManipulations.ArmstrongNumber;

public class ArmstrongTests {

    @Test
    void testIsArmstrong() {
        Assert.assertTrue(ArmstrongNumber.isArmstrong(153));
    }

    @Test
    void testIsNotArmstrong() {
        Assert.assertFalse(ArmstrongNumber.isArmstrong(121));
    }
}
