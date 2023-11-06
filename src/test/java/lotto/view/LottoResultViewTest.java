package lotto.view;

import static org.assertj.core.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import lotto.dto.LottosDTO;
import org.junit.jupiter.api.Test;

class LottoResultViewTest {
    private static ByteArrayOutputStream outputMessage = new ByteArrayOutputStream();
    @Test
    void 로또결과를_출력() {
        System.setOut(new PrintStream(outputMessage));
        LottosDTO lottosDTO = new LottosDTO(List.of(List.of(1, 2, 3, 4, 5, 6), List.of(45, 44, 43, 42, 41, 40)));

        LottoResultView.print(lottosDTO);

        assertThat(outputMessage.toString()).isEqualTo(
                "\n"
                        + "2개를 구매했습니다.\n"
                        + "[1, 2, 3, 4, 5, 6]\n"
                        + "[45, 44, 43, 42, 41, 40]\n"
                        + "\n"
        );
    }
}