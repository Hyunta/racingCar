package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringAddCalculatorTest {

    @Test
    void splitAndSumNullOrBlank() {
        int result = StringAddCalculator.splitAndSum(null);

        result = StringAddCalculator.splitAndSum("");

    }
}