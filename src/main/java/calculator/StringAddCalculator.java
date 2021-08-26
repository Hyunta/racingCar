package calculator;

public class StringAddCalculator {

    public static int splitAndSum(String s) {
        int result = 1;
        if (s == null || s.isBlank()) {
            return 0;
        }
        result = Integer.parseInt(s);
        return result;
    }
}

