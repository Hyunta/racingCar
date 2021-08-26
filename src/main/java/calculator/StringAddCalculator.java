package calculator;

import java.util.Arrays;
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
        while (st.hasMoreTokens()) {
            result += Integer.parseInt(st.nextToken());
        }
        return result;
    }
}

