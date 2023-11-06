package lotto.view;

import java.util.List;
import lotto.dto.LottosDTO;
import lotto.util.StringUtil;

public class LottoResultView {
    private static final String HEADER_FORM = "\n%d개를 구매했습니다.\n";

    public static void print(LottosDTO lottosDTO) {
        String header = buildHeader(lottosDTO);
        String content = buildContent(lottosDTO);
        System.out.println(header + content);
    }

    private static String buildHeader(LottosDTO lottosDTO) {
        return String.format(HEADER_FORM, lottosDTO.getLottos().size());
    }

    private static String buildContent(LottosDTO lottosDTO) {
        StringBuilder stringBuilder = new StringBuilder();
        lottosDTO.getLottos().forEach((numbers) ->
                        stringBuilder.append(toContent(numbers)).append("\n")
                );
        return stringBuilder.toString();
    }

    private static String toContent(List<Integer> numbers) {
        String content = StringUtil.divideNumsByCommas(numbers);
        return StringUtil.coverWithBrackets(content);
    }
}
