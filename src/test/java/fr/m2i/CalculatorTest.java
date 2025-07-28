package fr.m2i;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    @DisplayName("devrait retourner 5")
    public void testAddShouldReturn5() {
        Calculator calculator = new Calculator();
        int a = 2;
        int b = 3;

        int result = calculator.add(a, b);

        Assertions.assertEquals(5, result, "le resultat du calculator");
    }
}
