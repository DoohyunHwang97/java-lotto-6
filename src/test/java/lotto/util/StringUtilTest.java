package lotto.util;

import static org.assertj.core.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class StringUtilTest {

    @Test
    void divideNumsByCommas() {
        assertThat(StringUtil.divideNumsByCommas(List.of(1, 2, 3, 4, 5, 6))).isEqualTo("1, 2, 3, 4, 5, 6");
    }

    @Test
    void coverWithBrackets() {
        assertThat(StringUtil.coverWithBrackets("1, 2, 3, 4, 5, 6")).isEqualTo("[1, 2, 3, 4, 5, 6]");
    }
}