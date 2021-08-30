package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class RacingCarApplicationTest {
    @Test
    void splitCars() {
        String[] cars = RacingCarApplication.splitCars("a,b,c");
        assertThat(cars).containsExactly("a", "b", "c");
        cars = RacingCarApplication.splitCars("super,master");
        assertThat(cars.length).isEqualTo(2);
    }

    @Test
    void isLengthUnder5() {
        String cars = "a,abcdef,c";
        assertThatThrownBy(() -> RacingCarApplication.splitCars(cars))
                .isInstanceOf(IllegalStateException.class);

    }
}
