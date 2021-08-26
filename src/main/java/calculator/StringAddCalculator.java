package calculator;

import java.util.StringTokenizer;

public class StringAddCalculator {

    public static int splitAndSum(String text) {
        int result = 0;
        if (text == null || text.isBlank()) {
            return 0;
        }
        String delim = ",|:";
        String[] split = text.split("\n");
        if (split.length == 2) {
            delim = delim + "|" + split[0].charAt(2);
            text = split[1];
        }
        StringTokenizer st = new StringTokenizer(text, delim);
        result = getResult(result, st);
        return result;
    }

    private static int getResult(int result, StringTokenizer st) {
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if (num < 0) {
                throw new RuntimeException("음수 값 입력 금지");
            }
            result += num;
        }
        return result;
    }
}




