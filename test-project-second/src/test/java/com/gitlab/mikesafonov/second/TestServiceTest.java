package com.gitlab.mikesafonov.second;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestServiceTest {
    private TestService testService = new TestService();

    @Test
    void shouldReturn50() {
        Assertions.assertEquals(50, testService.calc(5, 5));
    }
}
