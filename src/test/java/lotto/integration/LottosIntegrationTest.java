package lotto.integration;

import static org.assertj.core.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import lotto.domain.LottoService;
import lotto.view.InputView;
import lotto.view.LottoResultView;
import org.junit.jupiter.api.Test;

public class LottosIntegrationTest {
    private static ByteArrayOutputStream outputMessage = new ByteArrayOutputStream();
    @Test
    void 금액을_적으면_로또를_생성한_결과를_출력() {
        System.setOut(new PrintStream(outputMessage));

        LottoService lottoService = new LottoService(() -> Arrays.asList(1, 2, 3, 4, 5, 6));
        InputView inputView = new InputView() {
            @Override
            protected String readInput() {
                return "2000";
            }
        };

        String money = inputView.viewMoneyInputForm();
        LottoResultView.print(lottoService.createLottos(money));

        assertThat(outputMessage.toString()).isEqualTo(
                "구입금액을 입력해 주세요.\n"
                        + "\n"
                        + "2개를 구매했습니다.\n"
                        + "[1, 2, 3, 4, 5, 6]\n"
                        + "[1, 2, 3, 4, 5, 6]\n"
                        + "\n"
        );
    }
}
