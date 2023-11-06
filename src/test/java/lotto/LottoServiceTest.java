package lotto;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import lotto.domain.LottoService;
import lotto.dto.LottosDTO;
import org.junit.jupiter.api.Test;

class LottoServiceTest {
    @Test
    void 금액을_1000원_단위로_나눈_수만큼_로또_생성() {
        LottoService lottoService = new LottoService(() -> Arrays.asList(1, 2, 3, 4, 5, 6));

        LottosDTO lottosDTO =  lottoService.createLottos("2000");

        assertThat(lottosDTO.getLottos().size()).isEqualTo(2);
        assertThat(lottosDTO.getLottos()).isEqualTo(
                        List.of(List.of(1, 2, 3, 4, 5, 6), List.of(1, 2, 3, 4, 5, 6)));
    }

    @Test
    void 금액이_천원단위가_아닐경우_IllegalArgumentException() {
        LottoService lottoService = new LottoService(new PickNumStrategyImpl());

        assertThatIllegalArgumentException()
                .isThrownBy(() -> lottoService.createLottos("2000"))
                .withMessage("로또 구입 금액은 1000원 단위여야 합니다.");
    }
}