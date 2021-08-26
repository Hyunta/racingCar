package calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class StringAddCalculatorTest {

    @Test
    void splitAndSumNullOrBlank() {
        int result = StringAddCalculator.splitAndSum(null);
        assertThat(result).isEqualTo(0);

        result = StringAddCalculator.splitAndSum("");
        assertThat(result).isEqualTo(0);

        result = StringAddCalculator.splitAndSum(" ");
        assertThat(result).isEqualTo(0);
    }

    @Test
    void splitAndSum_숫자하나() {
        int result = StringAddCalculator.splitAndSum("1");
        assertThat(result).isEqualTo(1);
        result = StringAddCalculator.splitAndSum("2");
        assertThat(result).isEqualTo(2);
        result = StringAddCalculator.splitAndSum("10");
        assertThat(result).isEqualTo(10);
    }

    @Test
    void splitAndSum_쉼표구분자() {
        int result = StringAddCalculator.splitAndSum("1,2");
        assertThat(result).isEqualTo(3);

        result = StringAddCalculator.splitAndSum("1,2,3");
        assertThat(result).isEqualTo(6);

    }

    @Test
    void splitAndSum_쉼표_또는_콜론_구분자() {
        int result = StringAddCalculator.splitAndSum("1,2:3");
        assertThat(result).isEqualTo(6);

        result = StringAddCalculator.splitAndSum("1:2:3");
        assertThat(result).isEqualTo(6);

        result = StringAddCalculator.splitAndSum("1:3");
        assertThat(result).isEqualTo(4);
    }

    @Test
    void splitAndSum_구분자() {
        int result = StringAddCalculator.splitAndSum("//;\n1;2;3");
        assertThat(result).isEqualTo(6);

        result = StringAddCalculator.splitAndSum("//-\n1-2-3");
        assertThat(result).isEqualTo(6);

        result = StringAddCalculator.splitAndSum("//&\n1&2,3:4");
        assertThat(result).isEqualTo(10);
    }
}