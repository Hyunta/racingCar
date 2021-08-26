package calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringAddCalculatorTest {

    @Test
    void splitAndSumNullOrBlank() {
        int result = StringAddCalculator.splitAndSum(null);
        Assertions.assertThat(result).isEqualTo(0);

        result = StringAddCalculator.splitAndSum("");
        Assertions.assertThat(result).isEqualTo(0);
    }
}