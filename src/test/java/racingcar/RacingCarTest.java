package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class RacingCarTest {
    @Test
    void splitCars() {
        String[] cars = RacingCar.splitCars("a,b,c");
        assertThat(cars).containsExactly("a", "b", "c");
        cars = RacingCar.splitCars("super,master");
        assertThat(cars.length).isEqualTo(2);
    }
}
