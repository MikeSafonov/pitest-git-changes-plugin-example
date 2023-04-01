package com.gitlab.mikesafonov.tests;

import com.gitlab.mikesafonov.test.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {
    private CalculatorService calculatorService = new CalculatorService();

    @Test
    void shouldReturn50() {
        Assertions.assertEquals(50, calculatorService.calc(5, 5));
    }
}
