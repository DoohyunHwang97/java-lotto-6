package lotto.util;

import java.util.List;

public class StringUtil {
    public static String divideNumsByCommas(List<Integer> numbers) {
        StringBuilder stringBuilder =  new StringBuilder(getFirstNum(numbers));

        stringBuilder.append(getFirstNum(numbers));
        for (int i = 1; i < numbers.size(); i++) {
            stringBuilder.append(", ").append(numbers.get(i));
        }

        return stringBuilder.toString();
    }

    private static Integer getFirstNum(List<Integer> numbers) {
        return numbers.get(0);
    }

    public static String coverWithBrackets(String string) {
        String HEADER = "[";
        String FOOTER = "]";
        return HEADER + string + FOOTER;
    }
}
