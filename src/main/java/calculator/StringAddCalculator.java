package calculator;

import java.util.StringTokenizer;

public class StringAddCalculator {

    public static int splitAndSum(String text) {
        int result = 0;
        if (text == null || text.isBlank()) {
            return 0;
        }
        StringTokenizer st = new StringTokenizer(text, ",|:");
        while (st.hasMoreTokens()) {
            result += Integer.parseInt(st.nextToken());
        }
        return result;
    }
}

