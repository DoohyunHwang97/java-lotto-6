package lotto;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import lotto.domain.Lotto;
import lotto.domain.Lottos;
import org.junit.jupiter.api.Test;

class LottosTest {
    @Test
    void 로또_생성_조회() {
        Lottos lottos = new Lottos();

        assertThat(
                List.of(
                        lottos.createLotto(() -> Arrays.asList(1, 2, 3, 4, 5, 6)),
                        lottos.createLotto(() -> Arrays.asList(45, 44, 43, 42, 41, 40))
                )
        )
                .isEqualTo(
                List.of(
                        new Lotto(Arrays.asList(1, 2, 3, 4, 5, 6)),
                        new Lotto(Arrays.asList(40, 41, 42, 43, 44, 45))
                )
        );
    }
}