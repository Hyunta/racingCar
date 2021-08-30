package racingcar;

import java.util.Scanner;

public class RacingCarApplication {

    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        Scanner scanner = new Scanner(System.in);
        String cars = scanner.nextLine();
        String[] splitCars = splitCars(cars);
    }

    public static String[] splitCars(String cars) {
        String[] split = cars.split(",");
        for (String car : split) {
            if (car.length() > 5) {
                throw new IllegalStateException("자동차 이름은 5자를 초과할 수 없습니다.");
            }
        }
        return split;
    }
}
